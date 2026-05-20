package seleniumbasics;

public class BrowserCommands extends Base{
public void verifyBrowserCommands()
{
String title=driver.getTitle();//to fetch the title of the application/webpage
System.out.println(title);//to print title in console



String handleId=driver.getWindowHandle();// to fetch the handle id of the window
System.out.println(handleId);


String url=driver.getCurrentUrl();//to fetch the url of the site
System.out.println(url);


String source=driver.getPageSource();//to fetch the source code of the site
System.out.println(source);


}
public void verifyNavigationCommands()
{
driver.navigate().to("https://www.flipkart.com/");//to navigate to another site	


driver.navigate().back();//back to previous site


driver.navigate().forward();//navigate again to flipkart site


driver.navigate().refresh();//reload the flipkart page


}
	public static void main(String[] args) {
	BrowserCommands browser=new BrowserCommands();
	browser.browserLaunch();
	//browser.verifyBrowserCommands();
	browser.verifyNavigationCommands();
	
	
		// TODO Auto-generated method stub

	}

}
