package testCase;

import lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Registration {
  @Test
  public void fbregister() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  TextBox.typeByName(driver, "email", "kamraj181@gmail.com");
	  
	  TextBox.typeById(driver, "pass", "kamraj181@");
	  
	  Dropdown.selectByidAndvisibleText(driver, "month", "Dec");

  }
}
