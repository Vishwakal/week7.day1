package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class MergeLeadPage extends PageLoginClose {
	
	Set<String> allWindows = null;
	List<String> allhandles = null;
	String leadId=null;
	Set<String> allWindows2 = null;
	List<String> allhandles2 = null;
	
	public  MergeLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	
	public FindLeadFramePage clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadFramePage(driver);
	}
	
	public MergeLeadPage SwitchFindLeadToMergeLead() {
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public FindLeadFramePage clickToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadFramePage(driver);
		
	}
	
	public viewLeadPage clickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new viewLeadPage(driver);
	}
}
