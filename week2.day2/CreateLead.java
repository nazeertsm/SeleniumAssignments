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
public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//1. Open a chrome browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//3. Enter Username as Demosalesmanager
		//4. Enter Password as crmsfa
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//5. Click on  Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//6. Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//7. Click on Leads tab
		driver.findElement(By.linkText("Create Lead")).click();
		//9. Enter company name, first name, last name
		//10. Click on Create Lead button
		//11. Get the Lead ID text and print
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("disneyworld");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nazeer");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ahmed");
		driver.findElement(By.className("smallSubmit")).click();
		String viewlead = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(viewlead);
		
		
			
		
	}

}
