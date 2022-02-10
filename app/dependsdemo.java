package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class dependsdemo {
	public WebDriver driver;
	@Test
	public void lanchBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("we are using chrome browser version 98",true);
		
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
	}
	@Test(dependsOnMethods = "lanchBrowser")
	public void openkite()
	{
	String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	}
	@Test(dependsOnMethods = "openkite")
	public void checkkitelogo() {
WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'kite')]"));
Assert.assertTrue(logo.isDisplayed());
System.out.println(logo.getCssValue("max-width"));
	}
		
	@Test(dependsOnMethods = "checkkitelogo")
		public void quitechrome() {
		driver.close();
}
}

