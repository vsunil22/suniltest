package com.asb.aq.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.asb.qa.BaseTest.BaseTest;



public class HomePage extends BaseTest {
	
	@FindBy(xpath="//td[containes(text(),ASB)]")
	WebElement homepage;
	
	@FindBy(xpath="//a[containes(text(),Merchant Search)]")
	WebElement LinkMerchantsearch;
	
	@FindBy(xpath="//select[containes(name,MerchantSearchTypeDropDown]")
	WebElement MerchantSearchDrowpdown;
	
	@FindBy(xpath="//input(@id=ctl00_ContentPlaceHolder1_SubmitSearchButton")
	WebElement searchbutton;
	
	//Actions
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean validatehomepage()
	{
		return homepage.isDisplayed();
	}
	
	public void Merchanthsearch()
	{
		LinkMerchantsearch.click();
		Select sc=new Select(MerchantSearchDrowpdown);
		sc.selectByIndex(1);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(LinkMerchantsearch).build().perform();
		ac.clickAndHold();
		ac.doubleClick();
		ac.keyDown(Keys.ALT);
		MerchantSearchDrowpdown.click();
		searchbutton.click();
	}
	
	
	
}
