package BasicFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonFunctions.WebButton;
import CommonFunctions.WebLink;
import CommonFunctions.WebTextBox;

public class SwitchToTenant extends base

{
	
	@Test
	public void switchtotenant() throws Exception
	{
		driver=initializeBrowser();
		driver.get(p.getProperty("url"));
		
		SwitchTenant t=new SwitchTenant(driver);
		Thread.sleep(5000);
		WebElement link=t.ClickOnChangeTenant();
		
		WebLink w=new WebLink();
		w.clickLink(link);
		Thread.sleep(5000);
		WebElement toggelbtn=t.toggelbtn();
		WebButton b=new WebButton();
		b.click(toggelbtn);
		//t.clickontoggleButton().click();
		
		WebElement TenantName=t.AcceptTenantName();
		WebTextBox TenName=new WebTextBox();
		TenName.sendInput(TenantName, "default");
		Thread.sleep(10000);
		WebElement switchTenant=t.Click();
		WebButton b2=new WebButton();
		Thread.sleep(7000);
		b2.click(switchTenant);
		
		VerifyLogin v=new VerifyLogin();
		v.read(driver);
	}
	
	//@Test
	/*public void acceptTenantName()
	{
		SwitchTenant t=new SwitchTenant(driver);
		WebElement TenantName=t.AcceptTenantName();
		WebTextBox TenName=new WebTextBox();
		TenName.sendInput(TenantName, "default");
	}
	
	@Test
	public void ClickonSwitchTenant()
	{
		SwitchTenant t=new SwitchTenant(driver);
		WebElement switchTenant=t.ClickOnChangeTenant();
		WebButton b=new WebButton();
		b.click(switchTenant);
	}
	*/
	


}
