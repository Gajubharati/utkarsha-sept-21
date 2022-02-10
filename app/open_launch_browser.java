package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class open_launch_browser {
	
	public WebDriver driver;
	@BeforeMethod
	public void lanchBrowser() {
		System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openkite()
	{
	driver.get("https://kite.zerodha.com");
	driver.manage().window().maximize();
	String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	}
	public void openfacebook() {
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
		@Test
		public void facebooklogo()
		{
			driver.get("https://www.facebook.com");
			WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'fb')]"));
			Assert.assertTrue(logo.isDisplayed());
		}
		@AfterMethod
		public void closebrowser() {
		driver.close();
}
}
