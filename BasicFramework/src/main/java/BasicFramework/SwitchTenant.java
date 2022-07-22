package BasicFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTenant
{
	public WebDriver driver;
	
	By ChangeTenant=By.xpath("//span[@class='ng-star-inserted']/following-sibling::a");
	
	By ClickToggle=By.xpath("//input[@name='SwitchToTenant']");
	
	By TenantName=By.xpath("//input[@name='tenancyNameInput']");
	
	By SwitchTenant=By.xpath("//button[@class='btn btn-primary btn-sm save-button']");
	
	public SwitchTenant(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ClickOnChangeTenant()
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver.findElement(ChangeTenant);
	}
	
	public WebElement toggelbtn()
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver.findElement(ClickToggle);
	}
	public WebElement AcceptTenantName()
	{
		return driver.findElement(TenantName);
	}
	
	public WebElement Click()
	{
		return driver.findElement(SwitchTenant);
	}

}
