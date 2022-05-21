package week6.day1.annotation;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {

//ChromeDriver should be in class level to access all method
public ChromeDriver driver;
	
@BeforeMethod
	public void startBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
@AfterMethod
public void closeBrowser() {
	System.out.println("Browser close method called");
	driver.close();
	
}
}