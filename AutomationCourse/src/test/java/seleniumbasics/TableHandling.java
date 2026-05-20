package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void verifyTable() {
		//to navigate
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		//fetch complete details from the table
		WebElement table=driver.findElement(By.id("dataTable"));
		
		 //to fetch data from the webpage consider data //exact text //getText() method//print in the console
		//fetch complete data in the table and print in the console
		//System.out.println(table.getText());
		
		//to fetch details in a row there we use the xpath+tbody+tr
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[5]"));
		System.out.println(tablerow.getText());
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.browserLaunch();
		table.verifyTable();

	}

}
