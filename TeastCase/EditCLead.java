package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.HomePage;
import Pages.LoginPage;

public class EditCLead extends PageLoginClose{
	
	@BeforeTest @BeforeClass
	public void getExcelData() {
		Filename="Editlead";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void Run2(String companyname) throws InterruptedException {
		
	new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickCrmsfa().clickLeads()
	.clickFindLead().clickPhonetab().enterPhoneNumber().searchFindLead().clickFirsLeadId().clickEdit().updateCompanyName(companyname).clickSubmitButton();
	}

}
