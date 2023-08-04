package Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Automation extends Base_Automation{
	
	static By login=By.xpath("//a[i[@class=\"fa fa-lock\"]]");
	static By email=By.xpath("//input[ @data-qa=\"login-email\"]");
	static By pwd=By.xpath("//input[ @data-qa=\"login-password\"]");
	static By log=By.xpath("//button[ @data-qa=\"login-button\"]");
	
	static WebElement Login=d.findElement(login);
	static WebElement Email=d.findElement(email);
	static WebElement Pwd=d.findElement(pwd);
	static WebElement Log=d.findElement(log);
	
	public static void login()
	{
		
	}
}
