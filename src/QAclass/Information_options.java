package QAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Information_options {
	
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	WebElement str = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	 
	  System.out.println(str.getText());
	  
	  if (str.getText().equalsIgnoreCase("INR")) {
		  
		  
		  System.out.println("Pass");
		
	} else {
		
		System.out.println("Failed");

	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal_swamykumar\\softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/spicejet.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
