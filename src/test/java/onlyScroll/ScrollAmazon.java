package onlyScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.WebdriverUtils;

public class ScrollAmazon {
	
	@Test
	public void amazon() throws InterruptedException
	{
		WebdriverUtils w = new WebdriverUtils();
		WebDriver driver = new ChromeDriver();
		
		w.maximizeWindow(driver);
		driver.get("https://www.flipkart.com/");
		w.waitForPageLoad(driver, 40);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=1; i<=5; i++)
		{
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(500);
		}
	}

}
