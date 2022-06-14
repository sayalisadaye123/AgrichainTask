package testclasses11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Page11.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	HomePage hp;
	
	
	@BeforeSuite
	public void startBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://agrichain.com/");
		
		
	}
	
//	@AfterSuite
//	public void tearDown() {
//		driver.quit();
//		
//	}  

	
	@BeforeClass
	public void objectCreation() {
	 hp = new HomePage(driver);
	 
	}
}
