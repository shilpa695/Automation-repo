package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;
public void browserLaunch() {// method creation
	
	driver=new ChromeDriver();//this opens the chrome driver
	
	driver.get("https://selenium.qabible.in/");// this opens the given website in th browser
	
	driver.manage().window().maximize();//  this maximizes the browser window
}
public void browserQuit() { // method creation
	//driver.close(); // this is also used to close the browser.but there is limitation. 
	            //consider there are 5 windows open at a time.by using close().we can close only the last window
	
	driver.quit();// this  completely closes  the browser
	
}
	public static void main(String[] args) {// main method
		Base base=new Base();//object creation
		base.browserLaunch(); // call browserlaunch
		base.browserQuit();// call browserquit
		// TODO Auto-generated method stubz

	}

}
