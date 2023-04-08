package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtomDemo {

	public static void main(String[] args) {
		// This code is practice on the Button elements using only xpaths
		
		String url = "https://www.leafground.com/button.xhtml";
		String driverPath = "C:\\Users\\HP\\Desktop\\Sarathi Drive\\Automation Projects\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//Case 1 : Click on the button element and get title of the webpage
		//xpath by Element and Attribute
		//syntax of Relative xpath //Element[@Attribute='value']
		
		WebElement sampleButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
		sampleButton.click();
		String titlename = driver.getTitle();
		
		System.out.println("Title Name of the browser is : " + titlename);
		
		driver.get(url);
		
		//Case 2 - Find the position of the button
		
		WebElement buttonPosition = driver.findElement(By.xpath("//*[@name='j_idt88:j_idt94']"));
		Point positionOfButton = buttonPosition.getLocation();
		int xValue = positionOfButton.getX();
		int yValue = positionOfButton.getY();
		System.out.println("The position of the button : " + xValue + " , " + yValue);
		
		//Case 3 - Get the color of the Element
		
		WebElement colorButton = driver.findElement(By.xpath("//button[@id = 'j_idt88:j_idt96']"));
		String colorValue = colorButton.getCssValue("background");
		System.out.println(colorValue);
		
		//Case 4 - Find the size of the Element
		
		WebElement sizeButton = driver.findElement(By.xpath("//button[@id = 'j_idt88:j_idt98']"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		
		System.out.println(height + " and " + width);
		
		
		driver.close();

	}

}
