package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println("TC1: Get attribute of the filed value");
		driver.get("http://leafground.com/pages/Edit.html");
		
		//String attribute = driver.findElement(By.xpath("//input[@name='username']/preceding-sibling::label[contains(text(),'Get default text entered')]")).getAttribute("value");
		
		String attribute = driver.findElement(By.xpath("//input[@name='username'][1]")).getAttribute("value");
		System.out.println(attribute);
		
		
		System.out.println("TC2: get the attribute color");
		driver.get("http://leafground.com/pages/Button.html");
		String attribute_color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(attribute_color);
		
		System.out.println("TC3: get the attribute href tag");
		driver.get("http://leafground.com/pages/Link.html");
		String attribute_href = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println(attribute_href);
		
		System.out.println("TC4:get the attribute location");
		driver.get("http://leafground.com/pages/Image.html");
		Point attribute_loc = driver.findElement(By.xpath("//label[@for='home']//following::img[1]")).getLocation();
		System.out.println(attribute_loc);
		
		
		
	
		
		
		
		
		
	
	}
	

}
