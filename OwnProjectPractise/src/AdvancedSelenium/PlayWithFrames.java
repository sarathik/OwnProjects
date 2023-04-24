package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.Route.TemplatizedRouteConfig;

public class PlayWithFrames {

	public static void main(String[] args) {
	// This program explains on the Frame Handles
		
		String url = "https://www.leafground.com/frame.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@id=\"Click\"]")).click();
		String textName = driver.findElement(By.xpath("//button[@id=\"Click\"]")).getText();
		System.out.println(textName);
		
		
		
	}

}
