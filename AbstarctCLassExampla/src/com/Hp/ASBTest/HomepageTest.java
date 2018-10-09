package com.Hp.ASBTest;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.asb.aq.Pages.HomePage;
import com.asb.aq.Pages.LoginPage;
import com.asb.qa.BaseTest.BaseTest;
import com.asb.qa.util.UtilTest;

public class HomepageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	String sheetname="MerchantData";
	
	
	public HomepageTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		intialize();
		loginpage =new LoginPage();
		homepage=loginpage.login();
		HomePage homepage=new HomePage();
		
	}
	
	
	@Test
	public void validatehomepage()
	{
		boolean b=homepage.validatehomepage();
		Assert.assertTrue(b, "home page not displyed");
	}
	
	@Test
	public void merchantserahcBynumber()
	{
		homepage.Merchanthsearch();
	}
//	@DataProvider
//	public Object[][] getmerchnatdata()
//	{
//		Object [][] data=UtilTest.getTestdata(sheetname);
//		return data;
//		
//		
//	}
//	
//	@Test(dataProvider="getmerchnatdata")
//	public void Addmerchant(String MerchantNumber,String BatchNumber,String BatchAmount,String CardholderNumber,String TransctionType,String Cardtype,String chargetype)
//	{
//		
//	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
