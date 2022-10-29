package BaseClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoginClose {
	
	public String Filename;
	
	public static ChromeDriver driver;
    @BeforeMethod
	public void login() {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchdata")
		public String[][] excel() throws IOException{
		return ExcelData.readSheetData(Filename);
		}
		
	}
