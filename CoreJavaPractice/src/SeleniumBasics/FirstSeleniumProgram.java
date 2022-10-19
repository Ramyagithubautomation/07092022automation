package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class FirstSeleniumProgram {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();  //webdriver is not class, it is an interface
		driver.get("https://demoqa.com/elements");
		manage();
		//gettitle();
		//findElement();
		//findElements();
		//navigation();
		//quitandclose();
		//ClickandsendKeys();
		//Scrolling();
		//DropDown();
	    //alert();
		//Windowhandles();
		//Takescreenshot();
		//frames();
		Actionsclass();
		
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
	
	public static void findElement() {

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
	
	
	public static void findElements() {
		// TODO Auto-generated method stub
	List<WebElement> list1=	driver.findElements(By.xpath("//span[text()='Stuffed Animals & Toys under $10']//ancestor::div[@class='a-section as-title-block']//following-sibling::div//descendant::li"));
		//return of findelements is a list of webelements
	for(WebElement ele:list1)
	{
		ele.click();
		driver.navigate().back();
	}
		
		
	}

	public static void navigation() {

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().to("https://www.amazon.com");	
		
	}
	
	
	public static void ClickandsendKeys() {
		
		WebElement TextBox=driver.findElement(By.xpath("//span[text()='Text Box']"));
		
		TextBox.click();
		
		WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.sendKeys("Ramya Mannem");
		
		WebElement fullName_label=driver.findElement(By.xpath("//label[@id='userName-label']"));
		System.out.println(fullName_label.getText());
	}

	private static void Scrolling() {
		
		//scroll down in selenium
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		//js.executeScript("window.scrollBy(0,1000)");
		
		//scroll till some element is visible
		WebElement Widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		js.executeScript("arguments[0].scrollIntoView();", Widgets);
		Widgets.click();
		
	}
	
	public static void DropDown()
	{
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		WebElement Widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		js.executeScript("arguments[0].scrollIntoView();", Widgets);
		Widgets.click();
		
		WebElement SelectMenu=driver.findElement(By.xpath("//span[text()='Select Menu']"));
		js.executeScript("arguments[0].scrollIntoView();", SelectMenu);
		SelectMenu.click();
				
		/*WebElement selectDropDown=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select select=new Select(selectDropDown);
		select.selectByVisibleText("Green");*/
		
		WebElement divtagdropdown=driver.findElement(By.xpath("//div[@class=\" css-yk16xz-control\"]"));
		
		
		//check this thing and update
		Actions action=new Actions(driver);
		action.click(divtagdropdown).build().perform();
		action.sendKeys(divtagdropdown,"Group 1, option 1").build().perform();
		//to press the enter button in keyboard
		action.sendKeys(Keys.ENTER).build().perform();		
		
	}

	
	public static void alert()
	{
		
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		WebElement alertsandframes=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();", alertsandframes);
		alertsandframes.click();
		WebElement alerts=driver.findElement(By.xpath("//li[@class=\"btn btn-light \"]//span[text()=\"Alerts\"]"));
		js.executeScript("arguments[0].scrollIntoView();", alerts);
		alerts.click();
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		
		driver.switchTo().alert().getText();
		
		String actualvalue=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		
		System.out.println(actualvalue);
	}

	public static void Windowhandles() {

		
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		WebElement alertsandframes=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();", alertsandframes);
		alertsandframes.click();
		WebElement browserwindow=driver.findElement(By.xpath("//li[@class=\"btn btn-light \"]//span[text()=\"Browser Windows\"]"));
		js.executeScript("arguments[0].scrollIntoView();", browserwindow);
		browserwindow.click();
		
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> windows=driver.getWindowHandles();  //duplicates are not allowed in set interface
		
		//return type of getwindowhandles method is a set of string of windowids
		
		
		//windows=window1,window2
		for(String indexwindow:windows)
		{
			if(!(indexwindow.equals(parentwindow)))
			{
			 driver.switchTo().window(indexwindow);
			 System.out.println(driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
			 driver.switchTo().window(parentwindow);
			}
		}
	}
	
	public static void Takescreenshot() throws IOException {

		TakesScreenshot ts=((TakesScreenshot)(driver));
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots.png");
		
		Files.copy(source, dest);
	}

	
	public static void frames() {
		
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		WebElement alertsandframes=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();", alertsandframes);
		alertsandframes.click();
		WebElement frames_menuitem=driver.findElement(By.xpath("//li[@class='btn btn-light ']//span[text()='Frames']"));
		js.executeScript("arguments[0].scrollIntoView();", frames_menuitem);
		frames_menuitem.click();
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("(//div[@id='framesWrapper']//div)[1]")).getText());
	}


	public static void Actionsclass() {

		
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		WebElement Widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		js.executeScript("arguments[0].scrollIntoView();", Widgets);
		Widgets.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Menu=driver.findElement(By.xpath("//span[text()='Menu']"));
		js.executeScript("arguments[0].scrollIntoView();", Menu);
		Menu.click();
		Actions action=new Actions(driver);
		action.contextClick().build().perform(); //right click on mouse
		WebElement menuele=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(menuele).build().perform();
		//action.dragAndDro
		//action.sendKeys(Keys.)
		
		
	}





	
	

}
