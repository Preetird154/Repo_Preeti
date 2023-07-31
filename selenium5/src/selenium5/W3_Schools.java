package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3_Schools {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com");
		
		d.manage().window().maximize();
		
		By login=By.id("w3loginbtn");
		WebElement Login=d.findElement(login);
		Login.click();
		
		Thread.sleep(2000);
		
		By email=By.id("modalusername");
		WebElement Email=d.findElement(email);
		Email.sendKeys("preetird2001@gmail.com");
		
		Thread.sleep(2000);
		
		By password=By.id("current-password");
		WebElement Password=d.findElement(password);
		Password.sendKeys("Preeti@8");
		
		Thread.sleep(2000);
		
		By log=By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
		WebElement Log=d.findElement(log);
		Log.click();
		
		Thread.sleep(2000);
		
		By exe=By.xpath("(//i[@class='fa fa-caret-down'])[2]");
		WebElement Exe=d.findElement(exe);
	    Exe.click();
		
	    Thread.sleep(2000);
	}

}
