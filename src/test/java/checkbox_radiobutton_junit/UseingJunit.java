package checkbox_radiobutton_junit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseingJunit {
	WebDriver driver;
	
	@Before
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
	@Test
	public void singlecheckbox1() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		   driver.findElement(By.id("checkBoxOption1")).click();
		 
	}
	@Test
	public void singleradio1() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	   driver.findElement(By.cssSelector("[value=\"radio2\"]")).click();
	 
	 }
	@Test
	 public void multipleCHECKBOX1() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     List<WebElement> mul=       driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	     for (WebElement check:mul) {
	    	 check.click();
	     }
	 
	 }
	@Test
	 public void multipleradio1() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     List<WebElement> mul1=       driver.findElements(By.xpath("//*[@type=\"radio\"]"));
	     for (WebElement check:mul1) {
	    	 check.click();
	     }
	 
	 }
	@After
	public void colse() {
		driver.close();
	}
	
	
}
