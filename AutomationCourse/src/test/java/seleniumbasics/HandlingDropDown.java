package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropDown() {
		// navigate 
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//first the locate the java element and create a webelement
		//dropdown properties are in select tag
		WebElement dropDown=driver.findElement(By.id("dropdowm-menu-1"));
		//value selected in dropdown in three different ways
		//1.select by index// 2.select by value //3.select by visible text
	     //these 3 methods are predefined methods//these methods are declare in a prefined class "select"
		//for that first create object creation for object class
		
	 Select select=new Select(dropDown);//write webelement in the braket
	 
	 
	 //select by index//index start from 0//index value ordered
	 select.selectByIndex(1);
	 
	 //select by index//select any value from the dom eg.value=python value-sql like that
	 select.selectByValue("python");
	 
	 
	 //select by visibletext// copy the txt from the dom
	 select.selectByVisibleText("SQL");
	}
		//checkbox//at a time multiple selection
	 public void verifyCheckBox() {
		 WebElement checkBox =driver.findElement(By.xpath("//input[@value='option-1']"));
		 System.out.println(checkBox.isSelected());
		 checkBox.click();
		
	  }
	 public void verifyRadioButton() {
		 WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
		   radioButton.click();
		 
	 }

	 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		HandlingDropDown down=new HandlingDropDown();
		down.browserLaunch();//call browser launch
		down.verifyDropDown();//call dropdown
		down.verifyCheckBox();//call check box
		down.verifyRadioButton();

	}


}

