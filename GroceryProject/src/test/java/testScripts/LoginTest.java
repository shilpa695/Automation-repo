package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.TestngBase;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase {
	HomePage home;

	@Test(priority = 1, description = "validating user login with valid credentials", groups = { "smoke" })
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		// assertion
		boolean dashboarddisplay = login.isDashboardDisplayed();
		Assert.assertTrue(dashboarddisplay, Constants.ValidCredentialError);

	}

	@Test(priority = 2, description = "validating user login with invalidusername and validpassword")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue)
				.clickOnSignInButton();

		boolean rememberme = login.isRememberSelected();
		Assert.assertFalse(rememberme, Constants.InvalidCredentialErrorwithInvalidUsername);
	}

	@Test(priority = 3, description = "validating user login with validusername and invalidpassword")
	public void verifyUserLoginWithvalidUsernameAndInValidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(2, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(2, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue)
				.clickOnSignInButton();

		String actual = login.isHeadingDisplayed();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected, Constants.InvalidCredentialsErrorwithInvalidPassword);
	}

	@Test(priority = 4, description = "validating user login with invalid credentials", groups = {
			"smoke" })
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		 String usernameValue = ExcelUtility.getStringData(3, 0,"signinpage");
		 String passwordValue = ExcelUtility.getStringData(3, 1,"signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue)
				.clickOnSignInButton();

		String actual = login.isHeadingDisplayed();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected, Constants.InvalidCredentialError);
	}

	/*@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
		};
	}*/
}
