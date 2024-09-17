package testCases;
import org.testng.annotations.Test;
import pageObjects.CreateCompanyUserPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_CreateCompanyUser extends BaseClass{


	
	@Test
	public void create_company_user() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setuserName(p.getProperty("username"));
		lp.setpassWord(p.getProperty("password"));
		lp.setSubmit();
		CreateCompanyUserPage cp= new CreateCompanyUserPage(driver);
		cp.ClickGoToCompanyUser();
		cp.ClickCreateCompanyUser();
		cp.setUserName("maya");
		cp.setPassword("Company@123");
		cp.setConfirmPassword("Company@123");
		cp.setContactName("Maya");
		cp.setEmailId("maya@getnada.com");
		cp.setAltEmail("maya@getnada.com");
		cp.setContactNum("9898677890");

	}
}
