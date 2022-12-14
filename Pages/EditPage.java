package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class EditPage  extends PageLoginClose{
	
	public EditPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public EditPage updateCompanyName(String companyname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	
	public EditPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}

}
