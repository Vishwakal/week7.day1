package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class LeadsPage extends PageLoginClose {
	
	public LeadsPage(EdgeDriver driver) {
		this.driver=driver;
	}

	
	  public CreateLead clickCreateLead() {
		  driver.findElement(By.linkText("Create Lead")).click();
		  return new CreateLead(driver);
	  }
	  
	  public FindLeadPage clickFindLead() {
		  driver.findElement(By.linkText("Find Leads")).click();
		  return new FindLeadPage(driver);
			
		}
	  public FindLeadFramePage clickMergeLead() {
		  driver.findElement(By.linkText("Merge Leads")).click();
		  return new FindLeadFramePage(driver);

		  
	  }
	
	
	

}
