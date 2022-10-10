package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();  //webdriver is not class, it is an interface
		driver.get("https://www.amazon.com");
		manage();
		//gettitle();
		findElement();
		//quitandclose();
	
	}
	
	
	

	public static void gettitle() {
		String title=driver.getTitle();
		System.out.println(title);	
	}
	
	public static void manage()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static void quitandclose()
	{
		driver.quit();
	}
	
	private static void findElement() {

	//WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox")); //return type - WebElement
	//WebElement searchbar=driver.findElement(By.name("field-keywords"));
	//WebElement searchbar=driver.findElement(By.className("nav-input nav-progressive-attribute"));
	//searchbar.sendKeys("milk");
	
	
	//driver.findElement(By.linkText("Gmail")).click();
	
	//xpath locator:
	
	//Relative xpath://img[@alt="Bedtime Originals Choo Choo Express Plush Elephant - Humphrey"]
		
	//To find the number of elements avaialable in a specific page
	System.out.println(driver.findElements(By.xpath("//*")).size());
		
	}

	
	
	
	
	
	
	

}
