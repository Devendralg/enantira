package onlyScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.WebdriverUtils;

public class TrainTicket 
{
	
	@Test
	public void irctc() throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebdriverUtils w = new WebdriverUtils();
		WebDriver driver = new ChromeDriver(opt);
		
		w.maximizeWindow(driver);
		driver.get("https://www.irctc.co.in/nget/train-search");
		w.waitForPageLoad(driver, 50);
		driver.findElement(By.xpath(" //a[@class=\"search_btn loginText ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//input[@formcontrolname=\"userid\"]")).sendKeys("Vmswamy310");	
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Bmswamy310");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c57-8 ui-autocomplete ui-widget\"]//input")).sendKeys("YESVANTPUR JN - YPR ");
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c57-9 ui-autocomplete ui-widget\"]//input")).sendKeys("KALABURAGI - KLBG ");
		WebElement drop = driver.findElement(By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12 pi pi-chevron-down\"]"));
		drop.click();
		driver.findElement(By.xpath("//span[.='TATKAL']")).click();
		WebElement date = driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]"));
		w.jsSendText(driver, date, "17/03/2024");
		driver.findElement(By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down\"]")).click();
		driver.findElement(By.xpath("//span[.='Sleeper (SL)']")).click();
		driver.findElement(By.xpath("//button[.='Search']")).click();
		driver.findElement(By.xpath("//div[@class=\"form-group no-pad col-xs-12 bull-back border-all\" and contains(.,' HAS SUR EXP (11312)')]//td[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"form-group no-pad col-xs-12 bull-back border-all\" and contains(.,' HAS SUR EXP (11312)')]//button[contains(.,' Book Now ')]")).click();
		
		
		

		
	}

}
