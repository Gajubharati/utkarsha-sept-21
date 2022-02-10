package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;
public class  inheritedemo extends dependsdemo{

	@Test(dependsOnMethods = "lanchBrowser")
	public void checktitle() {
		String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading Platform";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
}
