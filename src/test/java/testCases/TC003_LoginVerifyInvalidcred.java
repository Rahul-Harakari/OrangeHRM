package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.RetryLogin;
import testBase.BaseClass;

public class TC003_LoginVerifyInvalidcred extends BaseClass {
	
	@Test(groups= {"regression"})
		public void invalidLogin() {
		
		logger.info("Test case for Retry Login");
		
		try {
	
			LoginPage lp=new LoginPage(driver);
			lp.addUsername(p.getProperty("invalidusername"));
			logger.info("Added invalid username");
			lp.addPassword(p.getProperty("invalidpassword"));
			logger.info("Added invalid password");
			lp.btn_Login();
			logger.info("Click on the login button");
	
			RetryLogin rl= new RetryLogin(driver);
	
			String validatetxt = rl.txtretryValidation();
			Assert.assertEquals(validatetxt, "Invalid Credentials");
			logger.info("Validated invalid Credentials Text");
	
			lp.addUsername(p.getProperty("validusername"));
			logger.info("Added valid username");
			lp.addPassword(p.getProperty("validpassword"));
			logger.info("Added valid password");
			lp.btn_Login();
			logger.info("Clicked on the login button");
	
			DashboardPage dp=new DashboardPage(driver);
			String validatestr = dp.validate_txt();
	
			Assert.assertEquals(validatestr, "Employee Management");
			logger.info("Text Validated");
	
	
			dp.logout();
			logger.info("Logged out of the application");
		} catch(Exception e) {
			logger.error("Test case failed");
			Assert.fail();
		}

		logger.info("Test case executed");
}
}