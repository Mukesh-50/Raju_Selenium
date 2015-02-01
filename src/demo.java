import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import lib.SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("apurva.akshat@kvpcorp.com.qapartner");
		driver.findElement(By.id("password")).sendKeys("kvpisbest123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a")).click();
		driver.findElement(By.xpath("//input[@name='new']")).click();
		driver.findElement(By.xpath("//img[@alt='Account Name Lookup (New Window)']")).click();
		

		Thread.sleep(5000);
		 
		String parent=	driver.getWindowHandle();

		System.out.println("PARENT"+parent);

		Set<String>s1= driver.getWindowHandles();

		Iterator<String> i1=s1.iterator();

		while(i1.hasNext()){
			
		String child=	i1.next();

		System.out.println("cHILD"+child);
			
		if(!parent.equalsIgnoreCase(child)){
			
			
			String actual_data="Technical Data";
			
			driver.switchTo().window(child);
			
			String title=driver.switchTo().window(child).getTitle();
			
			System.out.println(title);
			
			SwitchTo.switchFrameByName(driver, "searchFrame");
			
			driver.findElement(By.xpath(".//*[@id='lksrch']")).sendKeys(actual_data);
			
			driver.findElement(By.xpath("//input[@name='go']")).click();
			
			
			SwitchTo.switchToDefaultContent(driver);
			
			
			SwitchTo.switchFrameByName(driver, "resultsFrame");
			
			
		   String record_xpath="//div[@class='bPageBlock brandSecondaryBrd secondaryPalette']//*[contains(text(),'"+actual_data+"')]";	
		  
		   System.out.println(record_xpath);
		  
		   driver.findElement(By.xpath(record_xpath)).click();
		}
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath(".//*[@id='name_lastcon2']")).sendKeys("asdsadsa");

		
		}
		
		
		
	}

}
