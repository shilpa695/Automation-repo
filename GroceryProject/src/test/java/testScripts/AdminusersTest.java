package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.TestngBase;
import constant.Constants;
import pages.AdminusersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminusersTest extends TestngBase {
	HomePage home;
	AdminusersPage admin;

	@Test(description = "validating use can able to add new users in adminusers")
	public void verifyWhetherTheUserIsAbleToAddANewUsers() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();

		// HomePage home=new HomePage(driver);
		admin = home.clickOnAdminuserMoreInfoField();

		FakerUtility faker = new FakerUtility();

		String newusernameValue = faker.createRandomUsername();
		String newpasswordValue = faker.createRandomPassword();

		// AdminusersPage admin=new AdminusersPage(driver);
		admin.clickOnNewButton().enterUsernameOnUsernameField(newusernameValue)
				.enterPasswordOnPasswordField(newpasswordValue).userTypeSelection().clickOnSaveButton();

		boolean alertmessage = admin.isAlertMessageDisplayed();
		Assert.assertTrue(alertmessage, Constants.NewUserFailureError);

	}

	@Test(description = "validating user can able to search in adminusers")
	public void verifyUserCanAbleToSearch() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();
		// HomePage home=new HomePage(driver);
		home.clickOnAdminuserMoreInfoField();

		// AdminusersPage admin=new AdminusersPage(driver);
		admin.clickOnSearchButton();

		String username2Value = ExcelUtility.getStringData(0, 0, "searchpage");
		admin.enterUsernameOnSearchUsernameField(username2Value).userTypeSelections().clickOnSearch2Button();

		boolean search2_Button = admin.isSearchButtonEnabled();
		Assert.assertTrue(search2_Button, Constants.SearchUserFailureError);

	}

	@Test(description = "validating user can able to reset in adminusers")

	public void verifyUserCanAbleToReset() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0, "signinpage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "signinpage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue).enterPasswordOnPasswordField(passwordValue);
		home = login.clickOnSignInButton();
		HomePage home = new HomePage(driver);
		home.clickOnAdminuserMoreInfoField();
		AdminusersPage admin = new AdminusersPage(driver);
		admin.clickOnResetButton();
		boolean Reset_Button = admin.isResetEnabled();
		Assert.assertTrue(Reset_Button, "unable to reset userslist");
	}
}
