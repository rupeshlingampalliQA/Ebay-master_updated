package PageObjects;


import org.testng.annotations.Test;

/**
 * Created by Rupesh on 1/5/2018.
 */

public class LoginTests extends BaseSetup {

	LoginPage loginPage;
	LandingPage landingPage;
	
	String userName = "testUser1";
	String passWord = "testPwd1";
	
	@Test
    public void testLogin()
    {
		loginPage.enterLoginDetails("ID", "Password");
		loginPage.clickLoginBtn();
		if (landingPage.signInBtn.isDisplayed()) {
			System.out.println("login failed");
		}else{
			System.out.println("login pass");
		}

    }
	

}
