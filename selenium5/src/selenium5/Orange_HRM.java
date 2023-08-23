package selenium5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_HRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com");
		
		d.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(5));
        WebElement u_name=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='username']"))));
        u_name.sendKeys("Admin");
		
//		By u_name=By.xpath("//input[@name=\"username\"]");
//		WebElement U_name=d.findElement(u_name);
//		U_name.sendKeys("Admin");
		
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
