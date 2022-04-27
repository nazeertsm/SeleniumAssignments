package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/*Assignment:1
===================
1. Load url "https://acme-test.uipath.com/login"
2. Enter email as "kumar.testleaf@gmail.com"
3. Enter Password as "leaf@12"
4. Click login button
5. Get the title of the page and print
6. Click on Log Out
7. Close the browser (use -driver.close())
*/

public class GetTheTitlePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");

		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Thread.sleep(5000);
		String title1 = driver.getTitle();

		System.out.println(title1);

		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();

		String title2 = driver.getTitle();

		System.out.println(title2);

		if (title2.equals("ACME System 1 - Log In")) {

			System.out.println("Sucessfully Logout");
		}

		else {
			System.out.println("Logout Operation failed");

		}
		Thread.sleep(5000);
		driver.close();

	}

}
