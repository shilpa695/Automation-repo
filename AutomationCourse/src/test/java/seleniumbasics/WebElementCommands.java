package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
  
	public void verifyWebElements() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	
	//input page url//to navigate to input form page
	
	WebElement messageBox=driver.findElement(By.id("single-input-field"));//textbox locate 
	                                                     //for reusing we need to use WebElement infront of the driver
	//sendkeys()-to input a text we can use sendkeys method // for text input use sendkeys method
	messageBox.sendKeys("Hello World");
	//whatever is given inside double quotes in sendkeys will appear exactly in the messagebox
	//hello world text is appear in the enter message column //this is the output
	
	WebElement valueA=driver.findElement(By.id("value-a"));
	valueA.sendKeys("10");
	WebElement valueB=driver.findElement(By.id("value-b"));
	valueB.sendKeys("20");
	
	
	
	
	//click() //second webelement commands
	WebElement showMessage=driver.findElement(By.id("button-one"));
	showMessage.click();
	WebElement getTotal=driver.findElement(By.id("button-two"));
	getTotal.click();
	
	
	
	//clear() webelement-erase the message from the messagebox
	messageBox.clear();
	valueA.clear();
	valueB.clear();
	
	
	
	
	
	//gettext()//to fetch the text in webpage
	WebElement yourMessage=driver.findElement(By.id("message-one"));
	 System.out.println(yourMessage.getText());
	 
	 
	 
	 System.out.println(showMessage.getTagName());// to fetch the tagname of an element
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands=new WebElementCommands();
		commands.browserLaunch();// for launching
		commands.verifyWebElements();

	}

}
