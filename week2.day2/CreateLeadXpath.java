package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/*
1. Open a chrome browser, 2. Load the URL: http://leaftaps.com/opentaps/control/main
3. Enter Username as Demosalesmanager, 4. Enter Password as crmsfa
5. Click on  Login Button, 6. Click on CRM/SFA link
7. Click on Leads tab, 8. Click on Create Lead Menu
9. Enter company name, first name, last name, 10. Click on Create Lead button
11. Get the Lead ID text and print
*/
public class CreateLeadXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//1. Open a chrome browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//3. Enter Username as Demosalesmanager
		//4. Enter Password as crmsfa
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Disneyworld");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Nazeer");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		String viewlead = driver.findElement(By.xpath("//span[@id= 'viewLead_companyName_sp']")).getText();
		System.out.println(viewlead);
		
		
		
		
		
		
		
		
		
	}

}
