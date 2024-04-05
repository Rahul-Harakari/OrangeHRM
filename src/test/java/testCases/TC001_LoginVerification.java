package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginVerification extends BaseClass {
	
	

	
	@Test
	public void login() {
		
		LoginPage lp=new LoginPage(driver);
		lp.addUsername("admin");
		lp.addPassword("3jg@4KVLtT");
		lp.btn_Login();
		
		
		DashboardPage dp=new DashboardPage(driver);
		String validatestr = dp.validate_txt();
		
		Assert.assertEquals(validatestr, "Employee Management");
		
		
		dp.logout();
		
		
	}
	
	
	
	
	

}
