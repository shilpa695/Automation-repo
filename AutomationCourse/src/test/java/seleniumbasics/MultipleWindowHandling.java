package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	
	public void verifyMultipleWindow() {
	
		driver.navigate().to("https://demo.guru99.com/popup.php");
		//first window so call its parent window.each window has its own handleid
		String parentwindow=driver.getWindowHandle();//first window handle id is fetched and stored in the parentwindow
		WebElement clickhereButton=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhereButton.click();
		Set<String>handleids=driver.getWindowHandles();//to get multiple window handleids
		System.out.println(handleids);
		//iteration interface similar to for each loop
		Iterator<String>it=handleids.iterator();
		while(it.hasNext()) {
			String currentid=it.next();//next is a predefined interface in iteration//current id for second window
			if(!currentid.equals(parentwindow))
			{
				driver.switchTo().window(currentid);
				WebElement emailButton=driver.findElement(By.xpath("//input[@name='emailid']"));
				emailButton.sendKeys("test@gmail.com");
				WebElement submitButton=driver.findElement(By.xpath("//input[@value='Submit']"));
				submitButton.click();
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MultipleWindowHandling multiplewindow= new MultipleWindowHandling();
      multiplewindow.browserLaunch();
      multiplewindow.verifyMultipleWindow();

	}

}
