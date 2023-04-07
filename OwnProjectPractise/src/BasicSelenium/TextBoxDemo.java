package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws Exception {
		
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.leafground.com/input.xhtml";
		driver.get(url);
		
		//Case 1 - Enter Name in the Text Box
		
		WebElement nameTxtBox = driver.findElement(By.id("j_idt88:name"));
		nameTxtBox.sendKeys("Sarathi Vigneswar");
		
		//Case 2 - Append the Text 
		
		WebElement cityTxtBox = driver.findElement(By.id("j_idt88:j_idt91"));
		cityTxtBox.sendKeys(" Pune");
		
		//Case 3 - Validate if the text box is disabled
		
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean state = disabledBox.isEnabled();
		System.out.println(state);
		
		if (state == false) {
			System.out.println("The text box is disabled");	
		}
		
		//Case 4 - Clear the text box
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		//Case 5 - Retrive the typed text 
		
		WebElement typedBox = driver.findElement(By.name("j_idt88:j_idt97"));
		String typedText = typedBox.getAttribute("value");
		System.out.println(typedText);
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
