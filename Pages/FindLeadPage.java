package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class FindLeadPage extends PageLoginClose {
	
	public FindLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public FindLeadPage clickPhonetab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;	
	}
	public FindLeadPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		return this;
	}
	public FindLeadPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FindLeadFramePage.leadId);
		return this;
	}
	
	public FindLeadPage searchFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this ;
	}
	
	public viewLeadPage clickFirsLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new viewLeadPage(driver);
	}
	
	public FindLeadPage verifyMergeLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
			return this;
		} else {
			System.out.println("Text not matched");
			return this;
		}


		
	}
	}


