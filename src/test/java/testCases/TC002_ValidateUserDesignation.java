package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_ValidateUserDesignation extends BaseClass {
	
	
	@Test(groups= {"sanity"})
	
	public void updateProfile() throws InterruptedException {
		
		logger.info("Test case for Validating User Designation");
		try {
		
		LoginPage lp=new LoginPage(driver);
		lp.addUsername(p.getProperty("validusername"));
		logger.info("Added Username");
		lp.addPassword(p.getProperty("validpassword"));
		logger.info("Added Password");
		lp.btn_Login();
		logger.info("Click on login");
		
		DashboardPage dp=new DashboardPage(driver);
		String designation = dp.validate_Designation();
		Assert.assertEquals(designation, "Regional HR Manager");
		logger.info("Designation is validated");
		
		dp.logout();
		logger.info("Logged out of the application");
		
		}catch(Exception e) {
			
			logger.error("Test case failed");
			Assert.fail();
		}
		
		logger.info("Test case Executed");
		
	}
	

}
