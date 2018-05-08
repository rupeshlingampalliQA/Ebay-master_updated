package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Rupesh on 1/5/2018.
 */

public class LoginPage {

	LandingPage landingPage;
	
	@CacheLookup
	@FindBy(id = "username")
	public WebElement userNameFld;

	@CacheLookup
	@FindBy(id = "password")
	public WebElement passwordFld;

	@CacheLookup
	@FindBy(id = "btnSignin")
	public WebElement loginBtn;

	@CacheLookup
	@FindBy(name = "forgot")
	public WebElement forgotBtn;

	public void enterLoginDetails(String id, String pwd) {

		landingPage.signInBtn.isDisplayed();
		landingPage.signInBtn.isDisplayed();
		userNameFld.sendKeys(id);
		passwordFld.sendKeys(pwd);

	}

	public void clickLoginBtn() {

		loginBtn.isEnabled();
		loginBtn.click();
		
	}



}
