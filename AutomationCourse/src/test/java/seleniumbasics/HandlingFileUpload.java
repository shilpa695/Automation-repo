package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	public void fileUploadingUsingSendkeys() {
	
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
		
		choosefile.sendKeys("C:\\Users\\Lenovo\\git\\Automation-repo\\AutomationCourse\\src\\test\\resources\\Sales Commission Agents - admin.pdf");
		WebElement checkBox=driver.findElement(By.id("terms"));
	     checkBox.click();
	     
	     
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();
	}
		
		//robot class
		
public void fileUploadingUsingRobotClass() throws AWTException {
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement submitfileUpload=driver.findElement(By.id("pickfiles"));
	submitfileUpload.click();
	//string selection=to select the text
	StringSelection selection=new StringSelection("C:\\Users\\Lenovo\\git\\Automation-repo\\AutomationCourse\\src\\test\\resources\\Sales Commission Agents - admin.pdf");
	
	//copy and paste to the clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	Robot robot=new Robot();
	robot.delay(2500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HandlingFileUpload fileUpload=new HandlingFileUpload();
      fileUpload.browserLaunch();
     // fileUpload.fileUploadingUsingSendkeys();
      try {
		fileUpload.fileUploadingUsingRobotClass();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
