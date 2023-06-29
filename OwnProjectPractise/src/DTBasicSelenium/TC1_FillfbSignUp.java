package DTBasicSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_FillfbSignUp {
	
	ChromeDriver driver;
	
	@Before
	public void initBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void createAccount() throws InterruptedException {
		WebElement accountBtn = driver.findElement(By.linkText("Create new account"));
		accountBtn.click();
		Thread.sleep(5000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Sarathi");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Viki");
		
		WebElement number = driver.findElement(By.name("reg_email__"));
		number.sendKeys("2524541234");
		
		WebElement passwd = driver.findElement(By.name("reg_passwd__"));
		passwd.sendKeys("Sa12345");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select sel = new Select(month);
		sel.selectByVisibleText("Sep");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select selDay = new Select(day);
		selDay.selectByIndex(19);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select selYear = new Select(year);
		selYear.selectByValue("1986");
		
		Thread.sleep(5000);
		
		
	}


	/*
	 * public static void main(String[] args) throws InterruptedException { // TODO
	 * Auto-generated method stub
	 * 
	 * TC1_FillfbSignUp tc1 = new TC1_FillfbSignUp(); tc1.openBrowser();
	 * tc1.createAcc(); }
	 */

}
