package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// This Class is to explain on Alert boxes
		
		String url = "https://www.leafground.com/alert.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		//Case 1 - Click on Alert button and click ok on the Alert box
		WebElement alertBtn = driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]"));
		alertBtn.click();
		
		//Switching the control to Alert box
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		alrt.accept();
		
		//Case 2 - Click on the Alert button and cancel 
		
		WebElement cancelBtn = driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt93\"]"));
		cancelBtn.click();
		
		Alert alrtCancel = driver.switchTo().alert();
		Thread.sleep(2000);
		alrtCancel.dismiss();
		
		//Case 3 - Click the prompt alert box and enter name
		
		WebElement promtBtn = driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt104\"]"));
		promtBtn.click();
		
		Alert pmtAlrt = driver.switchTo().alert();
		pmtAlrt.sendKeys("Sarathi");
		Thread.sleep(2000);
		pmtAlrt.accept();
		Thread.sleep(2000);
		
		//Case 4 - Click on Sweet promt and click on the button inside the alert window -- need to use the Robot action
		
		WebElement sweetAlrtBtn = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']"));
		sweetAlrtBtn.click();
		
	/*	Thread.sleep(5000);

		Alert alrtSweet = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']")).click();
		Thread.sleep(2000);*/
		
		driver.close();
 		

	}

}
