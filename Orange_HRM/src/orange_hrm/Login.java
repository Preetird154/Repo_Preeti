package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 class Login extends Base_class{
	
	static By u_name=By.xpath("//input[@name='username']");
	static By pwd=By.xpath("//input[@name=\"password\"]");
	static By login=By.xpath("//button[ text()=\" Login \"]");
	
	
	public static WebElement GetUname()
	{
		WebElement U_name=driver.findElement(u_name);
		return U_name;
	}
	
	public static void username() 
	{
		GetUname().sendKeys("Admin");
	}
	
	
	
	public static WebElement GetPwd()
	{
		WebElement Pwd=driver.findElement(pwd);
		return Pwd;
	}
	
	public static void password()
	{
		GetPwd().sendKeys("admin123");
	}
	
	
	
	
	public static WebElement GetLogin()
	{
		WebElement Login=driver.findElement(login);
		return Login;
	}
	public static void login()
	{
		GetLogin().click();
	}	
}
