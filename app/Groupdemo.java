package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groupdemo {
	
	public WebDriver driver;
	@Test
	public void start_point() {
		System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=3, groups = "sanity")
	public void checktitle() {
		System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		}
	@Test(priority = 2, groups = "sanity")
		public void clickelement() {
		driver.findElement(By.xpath("//a[contains(@href,'forgot')]")).click();
		}
	@Test(priority = 1, groups = "regression")
	public void logintest() {
		System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.id("userid")).sendKeys("GO1468");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.tagName("button")).click();;
	}
	}


