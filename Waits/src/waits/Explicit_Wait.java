package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		
		By dropbtn=By.xpath("//button[@class=\"dropbtn\"]");
		WebElement btn=d.findElement(dropbtn);
		btn.click();
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(4));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Facebook\"]"))).click();
	}

}
