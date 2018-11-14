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
	
	//intialize objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		username.sendKeys("demo26");
		password.sendKeys("Ag10le.Card");
		LoginButton.click();
		
	}
	
	

}
