package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class CreateLead extends PageLoginClose{
	
	public CreateLead(EdgeDriver driver) {
		this.driver=driver;
	}


	public CreateLead enterCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;

	}

	public CreateLead enterFirstName(String Firstname ){
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname);
		return this;
	}
	public CreateLead enterLastName(String Lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;
	}

	public CreateLead clickFinish() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
