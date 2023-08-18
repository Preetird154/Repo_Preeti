package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example extends Base_class{
	
	static By fname=By.xpath("//input[@id='fname']");
	static By lname=By.xpath("//input[@id='lname']");
	static By submit=By.xpath("//input[@value='Submit']");
	
	public static WebElement getFname()
	{
		driver.switchTo().frame("iframeResult");
		WebElement F_name=driver.findElement(fname);
		return F_name;
	}
	
	
	public static WebElement getlname()
	{
		WebElement l_name=driver.findElement(lname);
		return l_name;
	}
	
	public static WebElement getsubmit()
	{
		WebElement Submit=driver.findElement(submit);
		return Submit;
	}
	
	public static void f_name() 
	{
		getFname().sendKeys("Keerthi");
	}
	
	public static void l_name()
	{
		getlname().sendKeys("suresh");
	}
	
	public static void submit()
	{
		getsubmit().click();
	}
}
