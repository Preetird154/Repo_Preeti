package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://practicetestautomation.com");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		By a=By.id("menu-item-20");
		WebElement A=d.findElement(a);
		A.click();
		
		Thread.sleep(2000);
		
		By b=By.xpath("//a[text()=\"Test Login Page\"]");
		WebElement B=d.findElement(b);
		B.click();
		
		Thread.sleep(2000);
		
		// POSITIVE LOGIN INPUTS 
		
		By username=By.id("username");
		WebElement Username=d.findElement(username);
		Username.sendKeys("student");
		
		Thread.sleep(2000);
		
		By password=By.id("password");
		WebElement Password=d.findElement(password);
		Password.sendKeys("Password123");
		
		Thread.sleep(2000);
		
		By submit=By.id("submit");
		WebElement Submit=d.findElement(submit);
		Submit.click();
		
		By logout=By.xpath("//a[text()=\"Log out\"]");
		WebElement Logout=d.findElement(logout);
		Logout.click();
		
		
		// NEGATIVE USERNAME
		
		By username1=By.id("username");
		WebElement Username1=d.findElement(username1);
		Username1.sendKeys("incorrectUser");
		
		Thread.sleep(2000);
		
		By password1=By.id("password");
		WebElement Password1=d.findElement(password1);
		Password1.sendKeys("Password123");
		
		Thread.sleep(2000);
		
		By submit1=By.id("submit");
		WebElement Submit1=d.findElement(submit1);
		Submit1.click();
		
		Thread.sleep(2000);
		
		By logout1=By.xpath("//a[text()=\"Log out\"]");
		WebElement Logout1=d.findElement(logout1);
		Logout1.click();
		
	}

}
