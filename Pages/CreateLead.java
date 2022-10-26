package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class CreateLead extends PageLoginClose{
	
	public CreateLead(EdgeDriver driver) {
		this.driver=driver;
	}


	public CreateLead enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;

	}

	public CreateLead enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}
	public CreateLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}

	public CreateLead clickFinish() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
}
