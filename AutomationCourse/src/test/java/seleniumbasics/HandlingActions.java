package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	//mouseover//rightclick//draganddrop
	//mouseactions use a predefined class called actions
	//actions provide methods to mouseactions
	//mouseactions is done with the help of actions
	//mouseover
	public void verifyMouseOver() {
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.moveToElement(others).build().perform();//perform actions
	}
	
	//right click//same in manual 
	public void verifyRightClick() {
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.contextClick(others).build().perform();
	}

	
	//draganddrop
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HandlingActions actions=new HandlingActions();
   actions.browserLaunch();
  // actions.verifyMouseOver();
  // actions.verifyRightClick();
   actions.verifyDragAndDrop();
	}

}
