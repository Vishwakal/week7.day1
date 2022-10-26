package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClass.PageLoginClose;

public class DuplicateLeadPage extends PageLoginClose {
	
	public DuplicateLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLead clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new CreateLead(driver);
	}

}
