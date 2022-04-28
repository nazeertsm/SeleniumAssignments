package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingSendKeys {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		System.out.println("TC1: Select country");
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-country")).sendKeys("United States");
		driver.findElement(By.id("input-country")).sendKeys("India");

	}

}
