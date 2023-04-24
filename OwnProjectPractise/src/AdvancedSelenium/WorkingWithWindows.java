package AdvancedSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithWindows {

	public static void main(String[] args) throws Throwable {
		// Working with Windows
		
		String url = "https://www.leafground.com/window.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//TC1 - open new window and close the old window
		String oldWindow = driver.getWindowHandle();
		
		WebElement windowButton = driver.findElement(By.xpath("//button[@id=\"j_idt88:new\"]"));
		windowButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWins : handles) {
			driver.switchTo().window(newWins);
			Thread.sleep(5000);
			
		}
		System.out.println("New window opened");
		driver.close();
		
		//TC2- control to old window
		driver.switchTo().window(oldWindow);
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]")).click();
		int windowCount = driver.getWindowHandles().size();
		System.out.println(windowCount);
		
		// TC3 - close all window expect parent window
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt93\"]")).click();
		Set<String> allWind = driver.getWindowHandles();
		
		for (String currentWind : allWind) {
			if(!currentWind.equals(oldWindow)) {
				driver.switchTo().window(currentWind);
				driver.close();
			}
			
		}
		
		driver.quit();
			
		
		
	}

}
