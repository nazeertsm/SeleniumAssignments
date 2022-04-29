package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	/*
	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 2. Enter UserName
	 * and Password Using Id Locator 3. Click on Login Button using Class Locator 4.
	 * Click on CRM/SFA Link 5. Click on Accounts Button 6. Click on Find Accounts
	 * 7. Enter AccountName as "Credit Limited Account" 8. Click on Find Accounts
	 * using xpath Locator 9. Click on the edit Button 10. Get the Text of Account
	 * Name and verify 11. Get the Text of Description 12. Get the title of the page
	 * and verify it.
	 */

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// Click on Accounts Button
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[4]")).click();
		// Click on Find Account
		driver.findElement(By.xpath("//a[contains(text(),'Find Accounts')]")).click();
		driver.findElement(By.xpath("//input[@name='accountName']/following::input[@name='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//button[@class='x-btn-text']/following::button[contains(text(),'Find Accounts')]")).click();
				
		
		//unable to find the xpath for click the first matching record
		driver.findElement(By.xpath("(//a[contains(text(),'Debit Limited Account')])[2]")).click();
		
		

	}
	}