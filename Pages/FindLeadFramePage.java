package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class FindLeadFramePage extends PageLoginClose {
	
	Set<String> allWindows = null;
	List<String> allhandles = null;
	static String leadId=null;
	Set<String> allWindows2 = null;
	List<String> allhandles2 = null;
	
	public  FindLeadFramePage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	
	public FindLeadFramePage switchtoFromLeadpage() {
	    allWindows = driver.getWindowHandles();
	    allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
		
	}
	public FindLeadFramePage enterFromFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopi");
		return this;
	}
	
	public FindLeadFramePage enterToFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");
		return this;
	}
	
   public FindLeadFramePage clickFrameFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
   }
   public FindLeadFramePage getFirstLeadId() {
	   leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	   return this;
   }
   
   public MergeLeadPage clickFirstLeadIdinFrame() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);
   }
	

}
