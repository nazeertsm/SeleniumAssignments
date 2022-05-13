package week4.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTrains {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MDU", Keys.TAB);

		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("TPJ", Keys.TAB);

		boolean selected = driver.findElement(By.id("chkSelectDateOnly")).isSelected();
		if (selected) {
			driver.findElement(By.id("chkSelectDateOnly")).click();
		}
		
		
		//Find the table
		 WebElement elementTable = driver.findElement(By.xpath(("(//table)[3]")));

		
		// Locate the row of the table using tagname and get the size of the row
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows"+  rows.size());

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Number of colums"+  cols.size());

			for (int j = 0; j < cols.size(); j++) {

				System.out.println(cols.get(j).getText());
			}

		}

	}

}
