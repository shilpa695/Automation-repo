package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin_Field;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	WebElement logout_Field;
	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']")
	WebElement adminusermoreinfo_Field;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement manageNewsMoreInfo_Field;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement login_heading;

	public HomePage clickOnAdminField() {
		admin_Field.click();
		return this;
	}

	public LoginPage clickOnLogoutField() {
		logout_Field.click();
		return new LoginPage(driver);
	}

	public AdminusersPage clickOnAdminuserMoreInfoField() {
		adminusermoreinfo_Field.click();
		return new AdminusersPage(driver);
	}

	public ManagenewsPage clickOnManageNewsMoreInfoField() {
		manageNewsMoreInfo_Field.click();
		return new ManagenewsPage(driver);
	}

	// assertion
	public String isLoginHeadingDisplayed() {
		return login_heading.getText();
	}

}