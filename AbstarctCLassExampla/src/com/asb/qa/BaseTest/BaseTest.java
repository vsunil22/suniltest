/*
 * This mY second Commit and sunil as author
 */
package com.asb.qa.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

import com.asb.qa.util.UtilTest;
import com.asb.qa.util.webdrivereventlisterers;

public class BaseTest {
	
public	static WebDriver driver;
public	static Properties prop;
public  static EventFiringWebDriver edriver;
public static webdrivereventlisterers eventlistener;
	
	public BaseTest() {
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\sv78\\eclipse-workspace\\AbstarctCLassExampla\\src\\com\\asb\\qa\\config\\config.properties");
			prop.load(ip);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void intialize()
	{
		String breowsername = prop.getProperty("browser");
		
		if(breowsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Testing\\Automation\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(breowsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Automation\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(breowsername.equals("IE"))
		{
				System.setProperty("webdriver.ie.driver", "C:\\Testing\\Automation\\geckodriver.exe");
				driver=new InternetExplorerDriver();
				
		}
			
		edriver=new EventFiringWebDriver(driver);
		eventlistener = new webdrivereventlisterers();
		edriver.register(eventlistener);
		driver=edriver;
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(UtilTest.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(UtilTest.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.get(prop.getProperty("url"));
		driver.get("https://uspnsvulm185.americas.hpqcorp.net/servicing-asbbank/login.aspx");
	}
	

}
