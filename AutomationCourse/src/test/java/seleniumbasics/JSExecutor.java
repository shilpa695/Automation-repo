package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutor extends Base{
	public void verifyJS() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//for interface we are creating ref variable
		js.executeScript("arguments[0].click();",showMessageButton);
		
		//scroll down
		//js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSExecutor executor=new JSExecutor();
		executor.browserLaunch();
		executor.verifyJS();
	}

}
