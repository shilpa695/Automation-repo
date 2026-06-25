package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constants;

public class ManagenewsPage {
	public WebDriver driver;

	public ManagenewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(id = "news")
	WebElement enterthenews_Field;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save_Button;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search_Button;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement searchNews_Button;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement search2_Button;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement reset_Button;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement managealert;

	public ManagenewsPage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public ManagenewsPage enterANewNews() {
		enterthenews_Field.sendKeys(Constants.NewNews);
		return this;
	}

	public ManagenewsPage clickOnSaveButton() {
		save_Button.click();
		return this;
	}

	public ManagenewsPage clickOnSearchButton() {
		search_Button.click();
		return this;
	}

	public ManagenewsPage enterTheNews() {
		searchNews_Button.sendKeys(Constants.NewNews);
		return this;
	}

	public ManagenewsPage clickOnSearch2Button() {
		search2_Button.click();
		return this;
	}

	public ManagenewsPage clickOnResetButton() {
		reset_Button.click();
		return this;
	}

	// assertion
	public boolean isAlertMessageDisplayed() {
		return managealert.isDisplayed();

	}

	public boolean isSearchButtonEnabled() {
		return search2_Button.isEnabled();
	}

	public boolean isResetButtonEnabled() {
		return reset_Button.isEnabled();
	}
}