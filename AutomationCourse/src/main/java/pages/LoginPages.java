package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
     public WebDriver driver;
     
     public LoginPages(WebDriver driver){//instances(local variable)
     
     this.driver=driver;
     PageFactory.initElements(driver, this);//pagefactory is a predefined class.a method inside this predefined 
                                             //class called initelements//here webelements can be call only after initelements
      }
     @FindBy(id="user-name")WebElement userName;
     @FindBy(id="password")WebElement password;
     @FindBy(id="login-button")	WebElement loginButton;
     
     
     public void enterUsernameOnUsernameField(String usernamevalue) {
    	 userName.sendKeys(usernamevalue);
    	  }
     
     public void enterPasswordOnPasswordField(String passwordvalue) {
    	 password.sendKeys(passwordvalue);
     }
     
     public void clickOnLoginButton() {
    	 loginButton.click();
     }
     
     }


     
     
     
     
    

