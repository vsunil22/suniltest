package com.Hp.ASBTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.asb.aq.Pages.LoginPage;
import com.asb.qa.BaseTest.BaseTest;
import com.asb.qa.util.UtilTest;

@Listeners(com.asb.qa.util.TestngListeners.class)
public class LoginPageTest extends BaseTest{
	
	LoginPage loginpage;
	UtilTest util;
	
	
	 public LoginPageTest() 
	{
		 super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup()
	{
		intialize();
		loginpage=new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginpagetest()
	{
		
		loginpage.login();
		util.Takescreenshot();
		
		List<WebElement> List=driver.findElements(By.id(""));
		for(WebElement e:List)
		{
			if(e.isSelected())
			{
				String s=e.getText();
			}
			
		}
	
	Alert al=driver.switchTo().alert();
	al.accept();
	al.dismiss();
	al.sendKeys("");
	al.getText();
	
	
		
	}
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	

}
