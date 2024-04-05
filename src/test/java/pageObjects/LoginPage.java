package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='txtUsername']") WebElement input_Username;
	
	@FindBy(xpath="//input[@id='txtPassword']") WebElement input_Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_Login;

	
	public void addUsername(String username) {
		input_Username.sendKeys(username);
	}
	
	public void addPassword(String password) {
		input_Password.sendKeys(password);
	}
	
	public void btn_Login() {
		btn_Login.click();
	}
	
}
