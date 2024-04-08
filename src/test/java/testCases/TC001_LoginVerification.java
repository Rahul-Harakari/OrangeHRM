package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginVerification extends BaseClass {
	
	

	
	@Test
	public void login() {
		
		logger.info("Test case for valid credentials");
		try {
		LoginPage lp=new LoginPage(driver);
		lp.addUsername("admin");
		logger.info("Added Username");
		lp.addPassword("3jg@4KVLtT");
		logger.info("Added Password");
		lp.btn_Login();
		logger.info("Clicked on the login button");
		
		DashboardPage dp=new DashboardPage(driver);
		String validatestr = dp.validate_txt();
		
		Assert.assertEquals(validatestr, "Employee Management");
		logger.info("Text Validated");
		
		
		dp.logout();
		logger.info("Logged out of the application");
		} catch (Exception e) {
			logger.error("Test case failed");
			Assert.fail();
		}
		
		logger.info("Test case executed");
		
		
		
	}
	
	
	
	
	

}
