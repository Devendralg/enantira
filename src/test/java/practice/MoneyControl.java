package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoneyControl {
	
	@Test
	public void s()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//img[@alt=\"I like it\"]")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[.='Best Deals On Appliances'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		Actions act=new Actions(driver);
		act.moveByOffset(0, 500);
	}

}
