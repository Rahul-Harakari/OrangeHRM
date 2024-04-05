package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetryLogin extends BasePage {

	public RetryLogin(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div") WebElement txtRetry;
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]") WebElement inputUsername;
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]") WebElement inputPassword;
	
	@FindBy(xpath="//*[@id=\"btnLogin\"]") WebElement btnLogin;
	
	
	public String txtretryValidation() {
		try {
		return (txtRetry.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
		}

	
	public void addUsername(String username) {
		inputUsername.sendKeys(username);;
	}
	
	
	public void addPassword(String password) {
		
		inputPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	
}
