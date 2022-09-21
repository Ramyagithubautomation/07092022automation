package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	
	public static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		gettitlemethod();
		//quitandclosemethods();
		
	}
	
	
	public static void gettitlemethod()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public static void quitandclosemethods()
	{
		driver.quit();
	}
	
	public static void managemethod()
	{
		driver.manage().deleteAllCookies();
		
	}

}
