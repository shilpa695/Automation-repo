package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	//3 type alert 1.simple alert 2.confirm alert 3.prompt alert
	public void verifySimpleAlert() {
		//navigate
		driver.navigate().to("https://demoqa.com/alerts");
		// webelent creation to click the button
		WebElement simplealertbutton=driver.findElement(By.id("alertButton"));
		simplealertbutton.click();
		//to switch the control from webpage to popup
		Alert al=driver.switchTo().alert();
		al.accept();
	}
		  
		
		
		//confirm alert
		//ok=accept  cancel=dismiss
		public void verifyConfirmAlert() {
			driver.navigate().to("https://demoqa.com/alerts");
			WebElement confirmalert=driver.findElement(By.id("confirmButton"));
			confirmalert.click();
			Alert al=driver.switchTo().alert();
			al.accept();//dismiss
		}
		
		
		public void verifypromptAlert() {
			driver.navigate().to("https://demoqa.com/alerts");
			WebElement promptalert=driver.findElement(By.id("promtButton"));
			promptalert.click();
			Alert al=driver.switchTo().alert();
			al.sendKeys("QA test");
			al.accept();
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AlertHandling alertobj=new AlertHandling();
      alertobj.browserLaunch();
     // alertobj.verifySimpleAlert();
     // alertobj.verifyConfirmAlert();
      alertobj.verifypromptAlert();
      


	}

}
