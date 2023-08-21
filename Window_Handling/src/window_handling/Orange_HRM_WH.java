package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_WH {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentHandle=d.getWindowHandle();
		System.out.println("Parent Window - " + parentHandle);
		
		By link=By.xpath("//a[text()=\"OrangeHRM, Inc\"]");
		WebElement Link=d.findElement(link);
		Link.click();
		
		Set<String> handles=d.getWindowHandles();
		System.out.println(handles);
		
		for(String handle:handles)
		{
			if(!handle.equals(parentHandle))
			{
				d.switchTo().window(handle);
				By email=By.xpath("//input[@name=\"EmailHomePage\"]");
				WebElement Email=d.findElement(email);
				Email.sendKeys("abcd@gmail.com");
				Thread.sleep(3000);
				d.close();
				
				Thread.sleep(3000);
			}
		}
		
		d.switchTo().window(parentHandle);
		
		By u_name=By.xpath("//input[@name=\"username\"]");
		WebElement U_name=d.findElement(u_name);
		U_name.sendKeys("Admin");
		
		Thread.sleep(3000);
		
		By pwd=By.xpath("//input[@name=\"password\"]");
		WebElement Pwd=d.findElement(pwd);
		Pwd.sendKeys("admin123");
		
		Thread.sleep(3000);

		By login=By.xpath("//button[ text()=\" Login \"]");
		WebElement Login=d.findElement(login);
		Login.click();
		
		Thread.sleep(3000);
		
		By profile = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
		WebElement Profile = d.findElement(profile);
		Profile.click();
		
		Thread.sleep(3000);
		
		By logout = By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]");
		WebElement Logout = d.findElement(logout);
		Logout.click();
	}

}
