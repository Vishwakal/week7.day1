package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class viewLeadPage extends PageLoginClose {
	
	public viewLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public EditPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditPage(driver);
	}
	
	public FindLeadFramePage clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new FindLeadFramePage(driver);
	}
	
	public FindLeadPage clickFindLEad() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}

	public CreateLead clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new CreateLead(driver);
	}
	public viewLeadPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}
}
