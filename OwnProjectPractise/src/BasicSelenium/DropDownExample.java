package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws Throwable {
		// This class is following with the drop down element
		
		String url = "https://www.leafground.com/select.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		//Case 1 - Select Selenium from the drop down
		
		WebElement dropdownElement1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sel = new Select(dropdownElement1);
		
		sel.selectByIndex(4);
		Thread.sleep(5000);
		
		sel.selectByVisibleText("Selenium");
		
		driver.close();

	}

}
