package onlyScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.WebdriverUtils;

public class Flipkart {

	@Test
	public void scroll() throws InterruptedException
	{
		WebdriverUtils w = new WebdriverUtils();
		WebDriver driver = new ChromeDriver();
		w.maximizeWindow(driver);
		driver.get("https://www.flipkart.com/");
		w.waitForPageLoad(driver, 40);
		
	//	WebElement element = driver.findElement(By.xpath("//h2[.='Flipkart Plus']"));
		//w.scrollToElement(driver, element);
		//w.scrollXY(driver, 0, 500);
	//	w.jsObj(driver).executeScript("arguments[0].scrollIntoView()", element);
		
		//get Entire page Text
	//	System.out.println(w.getPageText(driver));
		
		// refresh page
	//	driver.navigate().refresh();
		Thread.sleep(1000);
	//	w.refreshPage(driver);
		//get page title
		System.out.println(w.getPageTitle(driver));
	WebElement loginBtn = driver.findElement(By.xpath("//span[.='Login']"));
		w.flash(driver, loginBtn);
		
	}
}
