package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
public class open_edgebrowser {
	public WebDriver driver;
	@BeforeMethod
	public void openedge() {
	System.setProperty("webdriver.edge.driver", "H:\\application\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
	}
	public void facebook() {
	
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();

 }
	public void opengoogle() {
	driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  String ExpectedTitle = "Google";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ExpectedTitle,ActualTitle);
}
	public void fblogo() {
	driver.get("https://www.facebook.com");
	WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'fb')]"));
	Assert.assertTrue(logo.isDisplayed());
}

@AfterMethod
public void close() {
	driver.close();

}
}