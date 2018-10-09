package com.asb.aq.Pages;

import java.io.IOException;

import org.apache.xerces.util.ParserConfigurationSettings;
import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.asb.qa.BaseTest.BaseTest;

public class LoginPage extends BaseTest {

	//create OR 
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ctl01_ctl00")
	WebElement username;
	
	@FindBy(name="ctl00_ContentPlaceHolder1_ctl01_ctl01")
	WebElement password;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_LoginButton")
	WebElement LoginButton;
	
	@FindBy(xpath="//id[containes(text(),,\"Card Operations\")]\")")
	WebElement textcardd;
	
	//intialize objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean validateAsbpage()
	{
		return textcardd.isDisplayed();
	}
	
	public HomePage login()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		LoginButton.click();
		return new HomePage();
			
		
	}
	
	

}
