package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public static int explicitwait = 5;

	public void waituntilelementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitforElementToBeSelected(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public void waitforAlertIsPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForInvisibilityOfElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

}
