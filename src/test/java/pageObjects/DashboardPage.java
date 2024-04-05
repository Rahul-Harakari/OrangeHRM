package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@ng-if='!ohrmnavbar.isClickableTitle($index)']") WebElement txt;
	
	@FindBy(xpath="//*[@id=\"navbar-logout\"]/a") WebElement btn_Logout;
	
	@FindBy(xpath="//*[@id=\"sidebar-profile-picture\"]/div[2]") WebElement text;
	
	public String validate_txt() {
		try {
		return (txt.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
			
		
	}
	
	public void logout() {
		btn_Logout.click();
	}
	
	
	public String validate_Designation() {
		
		try {
		return (text.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	
	
	
	
}
