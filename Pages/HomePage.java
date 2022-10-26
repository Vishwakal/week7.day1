package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class HomePage extends PageLoginClose {
	
	public HomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	

}
