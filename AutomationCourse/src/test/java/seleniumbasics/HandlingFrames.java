package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		//frames//switch to control into the frame//frames are the part of page
		//page contain multiple no of frames
		//find the number of frames
		//multiple element so findelements
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		WebElement frame1 =driver.findElement(By.id("frame1"));
		//to switch the control
		driver.switchTo().frame(frame1);//switching the frame
		WebElement frameHeading=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeading.getText());
		//go back from the current frame
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HandlingFrames frames=new HandlingFrames();
   frames.browserLaunch();
   frames.verifyFrames();
	 
 
	}

}
