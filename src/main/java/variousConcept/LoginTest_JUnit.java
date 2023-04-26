package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest_JUnit {
WebDriver driver;
@BeforeClass
public static void beforeClass() {
	System.out.println("beforeclass");
}
@AfterClass
public static void AfterClass() {
	System.out.println("Afterclass");
}
    @After
	  public  void tearDown() {
    	System.out.println("After");
      	//close window
      	driver.close();
  		driver.quit();	
		}
     
	 @Before
		public  void launchBrowser() {
			System.out.println("Before");
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			//clear cashe
			driver.manage().deleteAllCookies();
			//go to website
			driver.get("https://www.techfios.com/billing/?ng=admin/");
			//implicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//maximize
			driver.manage().window().maximize();	
			
			
		}
		@Test
	public void LoginTest() {
			System.out.println("Login");
		//username4
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				//password
				driver.findElement(By.id("password")).sendKeys("abc123");
				//signup
//				driver.findElement(By.name("login")).click();
				driver.findElement(By.name("login1")).click();
	}
	//@Test
public  void negLoginTest() {
	System.out.println("negLogin");
	//username4
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			//password
			driver.findElement(By.id("password")).sendKeys("abc1234");
			//signup
			driver.findElement(By.name("login")).click();
			
	}
	

}
