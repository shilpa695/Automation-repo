package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingLocators  extends Base{
	public void verifyLocators()
	{
	  driver.findElement(By.id("button-one"));       //ELEMENT LOCATING//id locator
	  
	  driver.findElements(By.id("button-two"));     //By is a predefined class 
	  
	  driver.findElement(By.className("btn btn-primary"));   //class locator
	  
	  driver.findElement(By.tagName("button"));       //using tag name
	  driver.findElement(By.name("viewport"));          //using name locator
	  driver.findElement(By.linkText("Simple Form Demo"));          //link text
	  driver.findElement(By.partialLinkText("Simple Form "));     //partial link text
	  driver.findElement(By.cssSelector("button[id='button-one']"));//tagname[attribute='attributevaue']
	//  /html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button//absolute xpath(since its start from route note,if there is any change it may affect)
	 driver.findElement(By.xpath("//button[@id='button-one']"));//syntax =//tagname[@attribute='attribute']
	 driver.findElement(By.xpath("//button[text()='Show Message']")) ;//xpath using text  //  //tagname[text()='text']
	                                                             
     driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));// where exact match is not found
	 driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
	 driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//  xpath using parent
	 driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));//xpath access  using child
	 driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//xpath access using following
	 driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));//xpath access using preceding
	 driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//xpath access using ancestor
	 driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//xpath using descendant
	 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

