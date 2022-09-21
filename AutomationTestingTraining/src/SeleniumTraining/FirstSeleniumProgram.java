package SeleniumTraining;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FirstSeleniumProgram {
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		//Demoqainvoke("chrome");
		//manage();
		//window();
		//TextBox();
		//Gettext();
		//scrolling();
		//DropDown();
		//actionsClass();
		//Alerts();
		//Frames();
		//Webtable();
		//BrowserPopups();
		Takescreenshot();
		//closeAndQuit();
		
		
		

	}

	
	
	private static void Takescreenshot() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver(); //chrome browser is invoked //runtime polymorphysim
		driver.get("https://demoqa.com/browser-windows");
		manage();
		window();
		TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File("./Screenshots/output.png");

        FileHandler.copy(SrcFile, DestFile);

		
		
		
		
	}



	private static void BrowserPopups() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver(); //chrome browser is invoked //runtime polymorphysim
		driver.get("https://demoqa.com/browser-windows");
		manage();
		window();
		
		driver.findElement(By.id("tabButton")).click();
		String parentwindow=driver.getWindowHandle(); //a windowID string //123
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		
		for(String windowid:windows) //for each loop     -> 123, 234
		{
			if(!windowid.equals(parentwindow))
			{
				driver.switchTo().window(windowid);
				String text=driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(text);
			}
			
		}	
	}

	
	


	private static void Webtable() {
		
		//static web table
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver(); //chrome browser is invoked //runtime polymorphysim
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		manage();
		window();
		for(int i=2;i<=7;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.println(driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]")).getText());
			}
		}*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver(); //chrome browser is invoked //runtime polymorphysim
		driver.get("https://demoqa.com/webtables");
		manage();
		window();
		int rowcount=driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-tr-group']")).size();
		int colcount=driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-tr-group'][1]//div[@class='rt-td']")).size();
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=1;j<=colcount;j++)
			{
				System.out.println(driver.findElement(By.xpath("//div[@class='rt-table']//div[@class='rt-tbody']//div[@class='rt-tr-group']["+i+"]//div[@class='rt-td']["+j+"]")).getText());
			}
		}
		
		
		
		
	}


	
	

	private static void Frames() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement alertswidgets=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		WebElement frames=driver.findElement(By.xpath("//span[text()='Frames']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView(true)", alertswidgets);
		alertswidgets.click();
		js.executeScript("arguments[0].scrollIntoView(true)", frames);
		frames.click();
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']//div")).getText());
	}



	private static void Alerts() {
		
		
		WebElement alertswidgets=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		WebElement alerts=driver.findElement(By.xpath("//span[text()='Alerts']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView(true)", alertswidgets);
		alertswidgets.click();
		js.executeScript("arguments[0].scrollIntoView(true)", alerts);
		alerts.click();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		alert.getText();
		
	}



	public static void Demoqainvoke(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver(); //chrome browser is invoked //runtime polymorphysim
			driver.get("https://demoqa.com/elements");
			
		}
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	public static void getTitle()
	{
		String ExpectedTitle="Amazon.com. Spend less. Smile more.";
		driver.get("https://demoqa.com/elements"); //get command does not store the browser history
		String Actualtitle=driver.getTitle();
		//driver.navigate().to("https://www.amazon.com"); //navigate command stores the browser history
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	
	
	public static void manage()
	{
		driver.manage().deleteAllCookies();
	}
	
	
	public static void window()
	{
		driver.manage().window().maximize();
		
	}
	
	public static void FindElement()
	{
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement ele1=driver.findElement(By.name("field-keywords"));
		WebElement ele2=driver.findElement(By.className("nav-input nav-progressive-attribute"));
		WebElement ele3=driver.findElement(By.linkText("business?ref=footer_aingw"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	
	public static void TextBox()
	{
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("ramya");
	}
	
	public static void Gettext()
	{
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	    String fullname=driver.findElement(By.id("userName-label")).getText();	
	    System.out.println(fullname);
	}
	
	public static void scrolling()
	{
		WebElement widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		WebElement selectmenu=driver.findElement(By.xpath("//span[text()='Select Menu']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView(true)", widgets);
		widgets.click();
		//js.executeScript("arguments[0].scrollIntoView(true)", selectmenu);
		//selectmenu.click();	
	}
	
	public static void DropDown()
	{
		WebElement widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		WebElement selectmenu=driver.findElement(By.xpath("//span[text()='Select Menu']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView(true)", widgets);
		widgets.click();
		js.executeScript("arguments[0].scrollIntoView(true)", selectmenu);
		selectmenu.click();
		//if there is a select tag in html code-> we can use select class
		
		//WebElement dropDownEle=driver.findElement(By.id("cars"));
		//Select select1=new Select(dropDownEle);
		//select1.selectByVisibleText("Audi");
		//select1.selectByIndex(0);
		
		
		//click on dropdown -> eneter some value-> press Enter on the keyboard
		WebElement dyndrpdownele=driver.findElement(By.xpath("//div[text()='Select Option']"));
		Actions action=new Actions(driver);
		action.click(dyndrpdownele).build().perform();
		action.sendKeys("A root Option").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	
	public static void actionsClass()
	{
		Actions action=new Actions(driver);
		WebElement widgets=driver.findElement(By.xpath("//div[text()='Widgets']"));
		WebElement menu=driver.findElement(By.xpath("//span[text()='Menu']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView(true)", widgets);
		widgets.click();
		js.executeScript("window.scrollTo(0,1000)");
		action.click(menu).build().perform();
		//mouse hover, double click, right click
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 2']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).build().perform();
		
		//action.dragAndDrop(widgets, menu)
		action.contextClick(); //right click action
		
		action.doubleClick(); //double click action
		
	}
	
	public static void closeAndQuit()
	{
		
		driver.close();  //it closes the current instance that is opened
		driver.quit(); //it closes all the instances that are opened
		
		
		
	}
	
	
	
}
