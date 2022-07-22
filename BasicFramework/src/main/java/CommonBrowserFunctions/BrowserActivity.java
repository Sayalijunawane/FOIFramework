package CommonBrowserFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserActivity 

{
	public WebDriver driver;
	Properties p;
	public WebDriver initializeBrowser() throws IOException
	{
		p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SayaliJunawane\\eclipse-workspace\\BasicFramework\\data.properties");
		p.load(fis);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit)
		
		String BrowserName=p.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else if (BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver CloseBrowser() 
	{
		driver.close();
		return driver;
	}
	

}
