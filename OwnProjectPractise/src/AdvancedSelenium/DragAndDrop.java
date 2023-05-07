package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// This is sample practise code
		
		String url = "https://www.leafground.com/drag.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement dragElement = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement toElement = driver.findElement(By.xpath("//*[@id=\"form:drop_header\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragElement,toElement );
		act.build().perform();
		
		driver.close();
		driver.quit();
		

	}

}
