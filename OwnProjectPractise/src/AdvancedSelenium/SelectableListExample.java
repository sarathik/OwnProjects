package AdvancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectableListExample {

	public static void main(String[] args) {
		// Example with Lists elements
		
		String url = "https://www.leafground.com/list.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> listElements = 
				driver.findElements(By.xpath("//*[@class=\"ui-widget-content ui-picklist-list ui-picklist-source ui-corner-bottom ui-sortable\"]/li"));
		
		int li = listElements.size();
		System.out.println(li);
		
		

	}

}
