package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	launchBrowser();
	LoginTest();
	tearDown();
	
	launchBrowser();
	negLoginTest();
	tearDown();
	}
	
public static void tearDown() {
	//close window
	driver.close();
	driver.quit();	
}

public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	driver = new ChromeDriver();
	//clear cashe
	driver.manage().deleteAllCookies();
	//go to website
	driver.get("https://www.techfios.com/billing/?ng=admin/");
	//maximize
	driver.manage().window().maximize();	
}
public static void LoginTest() {
	//username4
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	//password
	driver.findElement(By.id("password")).sendKeys("abc123");
	//signup
	driver.findElement(By.name("login")).click();
	
}

public static void negLoginTest() {
	//username4
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	//password
	driver.findElement(By.id("password")).sendKeys("abc1234");
	//signup
	driver.findElement(By.name("login")).click();
	
}
}

	
		


	



