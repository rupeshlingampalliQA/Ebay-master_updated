package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rupesh on 1/5/2018.
 */

public class LandingPage {
	
	
	 @CacheLookup
     @FindBy(id = "com.ebay.mobile:id/button_sign_in")
     public WebElement signInBtn;
	 
	 @CacheLookup
     @FindBy(id = "com.ebay.mobile:id/button_register")
     public WebElement registerBtn;

	 @CacheLookup
     @FindBy(id = "com.ebay.mobile:id/search_box")
     public WebElement searchFld;
}
