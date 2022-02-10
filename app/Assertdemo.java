package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertdemo {
 public WebDriver driver;
 
 @Test
 public void openbrowser() {
	 System.setProperty("webdriver.chrome.driver", "H:\\application\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 Reporter.log("we are sucessfully excuting starting point method",true);
 }
 @Test(priority = 1)
	public void checktitle()
	{
	String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
	String ActualTitle = driver.getTitle();
//	Assert.assertEquals(ExpectedTitle, ActualTitle); //default assert or Hard assert
	SoftAssert sassert = new SoftAssert();
	sassert.assertEquals(ActualTitle, ExpectedTitle);
	Reporter.log("we are sucessfully excuting checktitle method",true);
	sassert.assertAll();
	}
 @Test(priority = 2)
 public void clickelement() {
	 driver.findElement(By.xpath("//a[contains(@href,'forgot')]")).click();
	 Reporter.log("we are sucessfully excuting clickelemnet",true);
 }
 @Test(priority = 3)
 public void closebrowser() {
	 driver.close();
	 Reporter.log("we are sucessfully closed"); 
	 }
 }
