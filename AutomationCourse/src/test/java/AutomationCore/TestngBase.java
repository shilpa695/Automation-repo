package AutomationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestngBase {
	public WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {// method creation
		
		driver=new ChromeDriver();//this opens the chrome driver
		
		driver.get("https://www.saucedemo.com/");// this opens the given website in th browser
		
		driver.manage().window().maximize();//  this maximizes the browser window
	}
	@AfterMethod
	public void browserQuit() { // method creation
		//driver.close(); // this is also used to close the browser.but there is limitation. 
		            //consider there are 5 windows open at a time.by using close().we can close only the last window
		
		//driver.quit();// this  completely closes  the browser
		
	}

}
