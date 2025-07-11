package com.ui.orangeHRM.testLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ui.orangeHRM.baseLayer.BaseClass;
import com.ui.orangeHRM.pageLayer.LoginPage;

public class LoginPageTest extends BaseClass{

	
	@BeforeTest
	public void setUp()
	{
		initialization("Chrome");
	}
	
	
	@Test
	public void validateLoginPageFunctionality()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginPageFunctionality("Admin", "admin123");
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
