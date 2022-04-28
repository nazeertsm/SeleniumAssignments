package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println("TC1: Get attribute of the filed value");
		driver.get("http://leafground.com/pages/Edit.html");
		
		//String attribute = driver.findElement(By.xpath("//input[@name='username']/preceding-sibling::label[contains(text(),'Get default text entered')]")).getAttribute("value");
		
		String attribute = driver.findElement(By.xpath("//input[@name='username'][1]")).getAttribute("value");
		System.out.println(attribute);
		
		//Confirm that edit field is disabled or enables
		boolean Isenabled1 = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		System.out.println(Isenabled1);
		
		Thread.sleep(2000);
		//Confirm that Get default text entered  is disabled or enables
		boolean Isenabled2 = driver.findElement(By.xpath("//input[@name='username']/preceding::input[@value='TestLeaf']")).isEnabled();
		System.out.println(Isenabled2);
				
		System.out.println("TC2: get the attribute color");
		driver.get("http://leafground.com/pages/Button.html");
		String attribute_color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(attribute_color);
		
		
		System.out.println("TC3: get the attribute color");
		driver.get("http://leafground.com/pages/Button.html");
		boolean attribute_dis = driver.findElement(By.xpath("//button[@id='color']")).isDisplayed();
		System.out.println(attribute_dis);
		
		
		System.out.println("TC4: get the attribute href tag");
		driver.get("http://leafground.com/pages/Link.html");
		String attribute_href = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println(attribute_href);
		
		System.out.println("TC5:get the attribute location");
		driver.get("http://leafground.com/pages/Image.html");
		Point attribute_loc = driver.findElement(By.xpath("//label[@for='home']//following::img[1]")).getLocation();
		System.out.println(attribute_loc);
		
		System.out.println("TC6:check box selected");
		driver.get("http://leafground.com/pages/checkbox.html");
		boolean Isselected = driver.findElement(By.xpath("//div[@class='example']/input[3]")).isSelected();
		System.out.println(Isselected);
		Thread.sleep(2000);
		
	
		
				
		
	
	}
	

}
