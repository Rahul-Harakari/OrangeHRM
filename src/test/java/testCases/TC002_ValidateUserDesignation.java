package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_ValidateUserDesignation extends BaseClass {
	
	
	@Test
	
	public void updateProfile() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.addUsername("admin");
		lp.addPassword("3jg@4KVLtT");
		lp.btn_Login();
		
		DashboardPage dp=new DashboardPage(driver);
		String designation = dp.validate_Designation();
		Assert.assertEquals(designation, "Regional HR Manager");
		
		
		
		
		
	}
	

}
