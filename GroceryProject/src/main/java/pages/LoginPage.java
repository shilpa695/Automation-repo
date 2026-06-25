package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username_Field;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password_Field;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signInButton;
	@FindBy(xpath = "//label[@for='remember']")
	WebElement rememberme;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement heading;

	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;

	public LoginPage enterUsernameOnUsernameField(String usernameValue) {
		username_Field.sendKeys(usernameValue);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String passwordValue) {
		password_Field.sendKeys(passwordValue);
		return this;
	}

	public HomePage clickOnSignInButton() {
		WaitUtility wait = new WaitUtility();
		wait.waituntilelementToBeClickable(driver, signInButton);
		signInButton.click();
		return new HomePage(driver);
	}

	// assertion
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

	public String isHeadingDisplayed() {
		return heading.getText();
	}

	public boolean isRememberSelected() {
		return rememberme.isSelected();
	}

}
