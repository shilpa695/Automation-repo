package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.TestngBase;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagenewsPage;
import utilities.ExcelUtility;

public class ManagenewsTest extends TestngBase {
	HomePage home;
	ManagenewsPage news;

	@Test(description = "validating user can able to add new users in manageusers")

	public void verifyWhetherIsAbleToAddNewNews() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		// HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoField();

		// ManagenewsPage news=new ManagenewsPage(driver);
		news.clickOnNewButton().enterANewNews().clickOnSaveButton();

		boolean managealert = news.isAlertMessageDisplayed();
		Assert.assertTrue(managealert, Constants.NewNewsAddFailureError);
	}

	@Test(description = "validating user can able to search in manage users")
	public void verifyWhetherTheUsersCanAbleToSearch() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		// HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoField();

		// ManagenewsPage news=new ManagenewsPage(driver);
		news.clickOnSearchButton().enterTheNews().clickOnSearch2Button();

		boolean search2_Button = news.isSearchButtonEnabled();
		Assert.assertTrue(search2_Button, Constants.SearchNewsFailureError);

	}

	@Test(description = "validating user can able to reset in manageusers")

	public void verifyWhetherTheUsersIsAbleTOReset() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		// HomePage home=new HomePage(driver);
		home.clickOnManageNewsMoreInfoField();

		// ManagenewsPage news=new ManagenewsPage(driver);
		news.clickOnResetButton();

		boolean reset_Button = news.isResetButtonEnabled();
		Assert.assertTrue(reset_Button, Constants.ResetNewsFailureError);
	}
}
