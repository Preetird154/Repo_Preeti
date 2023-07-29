package selenium5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_WebSite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.automationexercise.com");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//FOR LOGIN TO YOUR ACCOUNT
		
		By b1=By.xpath("//a[i[@class=\"fa fa-lock\"]]");
		WebElement e1=d.findElement(b1);
		e1.click();
		
		Thread.sleep(2000);
		
		By b2=By.xpath("//input[ @data-qa=\"login-email\"]");
		WebElement e2=d.findElement(b2);
		e2.sendKeys("abcd@gmail.com");
		
		Thread.sleep(2000);
		
		By b3=By.xpath("//input[ @data-qa=\"login-password\"]");
		WebElement e3=d.findElement(b3);
		e3.sendKeys("abcd@1234");
		
		Thread.sleep(2000);
		
		By b4=By.xpath("//button[ @data-qa=\"login-button\"]");
		WebElement e4=d.findElement(b4);
		e4.click();
		
		// FOR NEW USER SIGNUP
		
		By c1=By.xpath("//input[ @data-qa=\"signup-name\"]");
		WebElement d1=d.findElement(c1);
		d1.sendKeys("ABCD");
		
		Thread.sleep(2000);
		
		By c2=By.xpath("//input[ @data-qa=\"signup-email\"]");
		WebElement d2=d.findElement(c2);
		d2.sendKeys("Abcd@1234");
		
		Thread.sleep(2000);
		
		By c3=By.xpath("//button[ @data-qa=\"signup-button\"]");
		WebElement d3=d.findElement(c3);
		d3.click();
		
		//FOR ENTER ACCOUNT INFORMATION (CREATE NEW ACCOUNT)
		
		By t=By.id("id_gender2");
		WebElement title=d.findElement(t);
		title.click();
		
		Thread.sleep(2000);
		
		By p=By.id("password");
		WebElement pw=d.findElement(p);
		pw.sendKeys("Abcd@1234");
		
		Thread.sleep(2000);
		
		By day=By.id("days");
		WebElement dy=d.findElement(day);
		Select sel=new Select(dy);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		By month=By.id("months");
		WebElement months=d.findElement(month);
		Select sel1=new Select(months);
		sel1.selectByVisibleText("February");
		
		Thread.sleep(2000);
		
		By year=By.id("years");
		WebElement years=d.findElement(year);
		Select sel2=new Select(years);
		sel2.selectByValue("2002");
		
		Thread.sleep(2000);
		
		

	}
}
