package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.RetryLogin;
import testBase.BaseClass;

public class TC003_LoginVerifyInvalidcred extends BaseClass {
	
	@Test
	public void invalidLogin() {
	
	LoginPage lp=new LoginPage(driver);
	lp.addUsername("vdsvsd");
	lp.addPassword("3jg@4KasaVLtT");
	lp.btn_Login();
	
	RetryLogin rl= new RetryLogin(driver);
	
	String validatetxt = rl.txtretryValidation();
	Assert.assertEquals(validatetxt, "Invalid Credentials");
	
	lp.addUsername("admin");
	lp.addPassword("3jg@4KVLtT");
	lp.btn_Login();
	
	DashboardPage dp=new DashboardPage(driver);
	String validatestr = dp.validate_txt();
	
	Assert.assertEquals(validatestr, "Employee Management");
	
	
	dp.logout();
	

}
}