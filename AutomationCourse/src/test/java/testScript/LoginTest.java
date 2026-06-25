package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AutomationCore.TestngBase;
import pages.LoginPages;
import utilities.ExcelUtility;

public class LoginTest extends TestngBase {
@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		//WebElement userName=driver.findElement(By.id("user-name"));
		//userName.sendKeys("standard_user");
		//WebElement password=driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		//WebElement loginButton=driver.findElement(By.id("login-button"));
		//loginButton.click();
	String usernamevalue=ExcelUtility.readStringData(0, 0,"loginpage");
	String passwordvalue=ExcelUtility.readStringData(0, 1,"loginpage");
	
	LoginPages login=new LoginPages(driver);
	login.enterUsernameOnUsernameField(usernamevalue);
	login.enterPasswordOnPasswordField(passwordvalue);
	login.clickOnLoginButton();
	}


@Test
public void verifyUserLoginWithInValidUsernameAndValidPassword() throws IOException {
	String usernamevalue=ExcelUtility.readStringData(1, 0,"loginpage");
	String passwordvalue=ExcelUtility.readStringData(1, 1, "loginpage");
	
	LoginPages login=new LoginPages(driver);
	login.enterUsernameOnUsernameField(usernamevalue);
	login.enterPasswordOnPasswordField(passwordvalue);
	login.clickOnLoginButton();
	
	
	
	
	
	//WebElement userName=driver.findElement(By.id("user-name"));
	//userName.sendKeys("istandard_user");
	//WebElement password=driver.findElement(By.id("password"));
	//password.sendKeys("secret_sauce");
	//WebElement loginButton=driver.findElement(By.id("login-button"));
	//loginButton.click();
	
	}


@Test
public void verifyUserLoginWithInValidPassWord() throws IOException {
	String usernamevalue=ExcelUtility.readStringData(2, 0,"loginpage");
	String passwordvalue=ExcelUtility.readStringData(2, 1, "loginpage");
	
	LoginPages login=new LoginPages(driver);
	login.enterUsernameOnUsernameField(usernamevalue);
	login.enterPasswordOnPasswordField(passwordvalue);
	login.clickOnLoginButton();
	
	
	
	//WebElement userName=driver.findElement(By.id("user-name"));
	//userName.sendKeys("standard_user");
	//WebElement password=driver.findElement(By.id("password"));
	//password.sendKeys("abcsecret_sauce");
	//WebElement loginButton=driver.findElement(By.id("login-button"));
	//loginButton.click();
	
	
	}


@Test
public void verifyUserLoginWithInValidCredentials() throws IOException {
	String usernamevalue=ExcelUtility.readStringData(3, 0,"loginpage");
	String passwordvalue=ExcelUtility.readStringData(3, 1, "loginpage");
	LoginPages login=new LoginPages(driver);
	login.enterUsernameOnUsernameField(usernamevalue);
	login.enterPasswordOnPasswordField(passwordvalue);
	login.clickOnLoginButton();
	
	
	
	//WebElement userName=driver.findElement(By.id("user-name"));
	//userName.sendKeys("ghstandard_user");
	//WebElement password=driver.findElement(By.id("password"));
	//password.sendKeys("ijsecret_sauce");
	//WebElement loginButton=driver.findElement(By.id("login-button"));
	//loginButton.click();
	
	}



}
