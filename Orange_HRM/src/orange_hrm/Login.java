package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 class Login extends Base_class{
	
	static By u_name=By.xpath("//input[@name='username']");
	static By pwd=By.xpath("//input[@name=\"password\"]");
	static By login=By.xpath("//button[ text()=\" Login \"]");
	
	static WebElement U_name=driver.findElement(u_name);
    static WebElement Pwd=driver.findElement(pwd);
	static WebElement Login=driver.findElement(login);
	
	
	public static void username() 
	{
		U_name.sendKeys("Admin");
	}
	
	public static void password()
	{
		Pwd.sendKeys("admin123");
	}
	
	public static void login()
	{
		Login.click();
	}	
}
