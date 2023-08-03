package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC_Abhibus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.abhibus.com/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		By from=By.xpath("//input[@id=\"source\"]");
		WebElement From=d.findElement(from);
		From.sendKeys("Hyderabad");
		
		Thread.sleep(2000);
		
		By from1=By.xpath("//input[@id=\"source\"]");
		WebElement From1=d.findElement(from1);
		From1.click();
		
		Thread.sleep(2000);
		
		By goingto=By.xpath("//input[@id=\"destination\"]");
		WebElement Going_to=d.findElement(goingto);
		Going_to.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		By date=By.xpath("//input[@id=\"datepicker1\"]");
		WebElement Date=d.findElement(date);
		Date.click();
		
		Thread.sleep(2000);
		
		By a=By.xpath("(//a[text()=\"12\"])[1]");
		WebElement A=d.findElement(a);
		A.click();
		
		Thread.sleep(2000);
		
		By search=By.xpath("//a[@id=\"seo_search_btn\"]");
		WebElement Search=d.findElement(search);
		Search.click();
		
		Thread.sleep(2000);
	}

}
