package BasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonBrowserFunctions.ReadExcel;

public class VerifyLogin extends base
{
	String uname;
	String password;
	/*public VerifyLogin(WebDriver driver)
	{
		this.driver=driver;
	}*/
	
	public void read(WebDriver driver) throws Exception
	{
	
	ReadExcel r1=new ReadExcel();
	String[] temp1=r1.ReadfromExcel();

	System.out.println("temp1[1]="+temp1[1]);
	System.out.println("temp1[2]="+temp1[2]);
	uname=temp1[1];
	password=temp1[2];
	System.out.println("uname is="+uname);
	System.out.println("Password  is="+password);
	//driver=initializeBrowser()
	//driver.get(p.getProperty("url"));
	LoginPageTest lp=new LoginPageTest(driver); 
	Thread.sleep(12000);
	lp.getemail().sendKeys(uname);
	Thread.sleep(10000);
	lp.getpassword().sendKeys(password);
	Thread.sleep(10000);
	lp.Login().click();
	
	/*if(!uname.equals("uname") && !password.equals("123qwe") )
	{
		driver.findElement(By.xpath("//*[text()='Ok']")).click();
		System.out.println("you are in else");
	
	}
	else {
		//CraeteTenant t=new CraeteTenant();
	//	t.NewTenant(driver);
	}
	*/
	}
}
