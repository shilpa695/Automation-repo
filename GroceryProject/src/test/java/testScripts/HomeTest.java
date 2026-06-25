package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.TestngBase;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestngBase {
	HomePage home;

	@Test(description = "Validating user can able to logout sucessfully", retryAnalyzer = retrymechanism.Retry.class)
	public void verifyUserCanAbleToLogoutSucessfully() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		home.clickOnAdminField();
		login = home.clickOnLogoutField();

		// assertion
		String actual = home.isLoginHeadingDisplayed();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected, Constants.LoginError);

	}
}