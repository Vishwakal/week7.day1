package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.LoginPage;

public class TestCaseCreateLead extends PageLoginClose{
	
	
	
	@BeforeTest @BeforeClass
	public void getExcelData() {
		Filename="Creatlead";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void runTestcase( String companyname,String Firstname,String Lastname) {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin()
		.clickCrmsfa().clickLeads().clickCreateLead().enterCompanyName(companyname)
		.enterFirstName(Firstname).enterLastName(Lastname).clickFinish();;
 
}
}

