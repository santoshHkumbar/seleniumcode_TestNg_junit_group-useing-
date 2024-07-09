package checkbox_radiobutton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseingTestng {
	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 //open the website 
		 WebDriverManager.chromedriver().setup();
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 //Visiting the applications
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 //window to be maximize
		 driver.manage().window().maximize();	

}
	 @Test(priority = 1,groups = {"functinal"})
	 public void singleCHECKBOX() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	   driver.findElement(By.id("checkBoxOption1")).click();
	 
	 }
	 @Test(priority = 2,groups = {"functinal"})
	 public void singleradio() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	   driver.findElement(By.cssSelector("[value=\"radio2\"]")).click();
	 
	 }
	 @Test(priority = 2,groups = {"smoke"})
	 public void multipleCHECKBOX() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     List<WebElement> mul=       driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	     for (WebElement check:mul) {
	    	 check.click();
	     }
	 
	 }
	 @Test(priority = 2,groups = {"smoke"})
	 public void multipleradio() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     List<WebElement> mul1=       driver.findElements(By.xpath("//*[@type=\"radio\"]"));
	     for (WebElement check:mul1) {
	    	 check.click();
	     }
	 
	 }
	 @AfterTest
	 public void close() {
		 driver.close();
	 }
}
