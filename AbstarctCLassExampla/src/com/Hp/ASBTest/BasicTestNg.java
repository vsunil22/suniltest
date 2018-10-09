package com.Hp.ASBTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNg { 
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Automation\\geckodriver.exe");
//		driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.ie.driver", "C:\\Testing\\Automation\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//		driver=new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uspnsvulm185.americas.hpqcorp.net/servicing-asbbank/login.aspx");
		
	}
	
	@Test
	public void Login()
	{
		String titlle=driver.getTitle();
		System.out.println(titlle);
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
	

}
