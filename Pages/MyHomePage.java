package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;



public class MyHomePage extends PageLoginClose  {
	
	public MyHomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	
	public LeadsPage clickLeads(){
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
		
	}

}
