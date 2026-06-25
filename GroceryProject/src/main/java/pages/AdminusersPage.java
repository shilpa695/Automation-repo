package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminusersPage {
	public WebDriver driver;

	PageUtility utility = new PageUtility();

	public AdminusersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' New']")
	WebElement new_button;
	@FindBy(id = "username")
	WebElement username_Field;
	@FindBy(id = "password")
	WebElement password_Field;
	@FindBy(id = "user_type")
	WebElement drop_down;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement save_Button;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search_Button;
	@FindBy(id = "un")
	WebElement searchUsername_Field;
	@FindBy(id = "ut")
	WebElement userType;
	@FindBy(xpath = "//button[@value='sr']")
	WebElement search2_Button;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement Reset_Button;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement newalert;

	public AdminusersPage clickOnNewButton() {
		new_button.click();
		return this;
	}

	public AdminusersPage enterUsernameOnUsernameField(String usernameValue) {
		username_Field.sendKeys(usernameValue);
		return this;
	}

	public AdminusersPage enterPasswordOnPasswordField(String passwordValue) {
		password_Field.sendKeys(passwordValue);
		return this;
	}

	public AdminusersPage userTypeSelection() {
		// Select select=new Select(drop_down);
		// select.selectByIndex(2);
		utility.SelectDropdownByIndex(drop_down, 2);
		return this;
	}

	public AdminusersPage clickOnSaveButton() {
		save_Button.click();
		return this;
	}

	public AdminusersPage clickOnSearchButton() {
		search_Button.click();
		return this;
	}

	public AdminusersPage enterUsernameOnSearchUsernameField(String username2Value) {
		searchUsername_Field.sendKeys(username2Value);
		return this;
	}

	public AdminusersPage userTypeSelections() {

		// Select select=new Select(userType);
		// select.selectByIndex(2);
		utility.SelectDropdownByIndex(userType, 2);
		return this;
	}

	public AdminusersPage clickOnSearch2Button() {
		search2_Button.click();
		return this;
	}

	public AdminusersPage clickOnResetButton() {
		WaitUtility wait = new WaitUtility();
		wait.waituntilelementToBeClickable(driver, Reset_Button);
		Reset_Button.click();
		return this;
	}

	// assertion
	public boolean isAlertMessageDisplayed() {
		return newalert.isDisplayed();
	}

	public boolean isSearchButtonEnabled() {
		return search2_Button.isEnabled();
	}

	public boolean isResetEnabled() {
		return Reset_Button.isEnabled();
	}
}
