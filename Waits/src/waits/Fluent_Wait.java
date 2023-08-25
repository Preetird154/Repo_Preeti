package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {
	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://theautomationzone.blogspot.com/");
		d.manage().window().maximize();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(d)
		     .withTimeout(Duration.ofSeconds(10))
		     .pollingEvery(Duration.ofSeconds(2))
		     .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"my_buttons\"])[4]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"my_buttons\"])[5]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"my_buttons\"])[6]"))).click();
		
//		By btn1=By.xpath("(//button[@class=\"my_buttons\"])[4]");
//		WebElement Btn1=d.findElement(btn1);
//		Btn1.click();
	}
}
