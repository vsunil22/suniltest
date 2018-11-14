package SimpleAbstarct;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleectclassExpn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://uspnsvulm806.lab.ad.elabs.svcs.entsvcs.net/servicing-rcuap/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_ctl00")).sendKeys("qtptestmar25");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl01_ctl01")).sendKeys("Ag1le.Card");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_LoginButton")).click();
		driver.findElement(By.linkText("Customer Search")).click();
		
		//select class
		Select sc= new Select(driver.findElement(By.id("BySearchTypeDropDown")));
		sc.selectByIndex(1);
		
		driver.findElement(By.id("ByLastName")).sendKeys("test");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_SubmitSearchButton")).click();
		
		List<WebElement> imagelist=driver.findElements(By.tagName("img"));
		for(int i=0;i<imagelist.size();i++)
		{
			System.out.println(imagelist.size());
			System.out.println(imagelist.get(i).getAttribute("img"));
		}
		
		//Actions Class
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Inventory Management"))).build().perform();
		driver.findElement(By.linkText("Order Search")).click();
		
		driver.findElement(By.xpath("//input[@type=checkbox"));
		
		
		
		
		Thread.sleep(200);

	}

}
