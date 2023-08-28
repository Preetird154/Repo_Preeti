package window_handling;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRM extends Base_class {
	
	static By link=By.xpath("//a[text()=\"OrangeHRM, Inc\"]");
	static By email=By.xpath("//input[@name=\"EmailHomePage\"]");
	static By u_name=By.xpath("//input[@name=\"username\"]");
	static By pwd=By.xpath("//input[@name=\"password\"]");
	static By login=By.xpath("//button[ text()=\" Login \"]");
	static By profile = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
	static By logout = By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]");
	
	public static WebElement link()
	{
		WebElement Link=driver.findElement(link);
		return Link;
	}
	
	public static WebElement email()
	{
		WebElement Email=driver.findElement(email);
		return Email;
	}
	
	public static WebElement uname()
	{
		WebElement U_name=driver.findElement(u_name);
		return U_name;
	}
	
	public static WebElement pwd()
	{
		WebElement Pwd=driver.findElement(pwd);
		return Pwd;
	}
	
	public static WebElement login()
	{
		WebElement Login=driver.findElement(login);
		return Login;
	}
	
	public static WebElement profile()
	{
		WebElement Profile = driver.findElement(profile);
		return Profile;
	}
	
	public static WebElement logout()
	{
		WebElement Logout = driver.findElement(logout);
		return Logout;
	}
	
	public static void clicklink()
	{
		link().click();
	}
	
	public static void enteremail()
	{
		email().sendKeys("abcd@gmail.com");
	}
	
	public static void enteruname()
	{
		uname().sendKeys("Admin");
	}
	
	public static void enterpwd()
	{
		pwd().sendKeys("admin123");
	}
	
	public static void clicklogin()
	{
		login().click();
	}
	
	public static void clickprofile()
	{
		profile().click();
	}
	
	public static void clicklogout()
	{
		logout().click();
	}
	
	public static void actions() throws InterruptedException
	{
		
		enteruname();
		Thread.sleep(2000);
		
		enterpwd();
		Thread.sleep(2000);
		
		clicklogin();
		Thread.sleep(2000);
		
		clickprofile();
		Thread.sleep(2000);
		
		clicklogout();
		Thread.sleep(2000);
	}
}