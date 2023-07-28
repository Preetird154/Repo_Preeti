package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com");
		
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		By b=By.xpath("//input[@name=\"username\"]");
		WebElement ele=d.findElement(b);
		ele.sendKeys("Admin");
		
		Thread.sleep(3000);
		
		By b1=By.xpath("//input[@name=\"password\"]");
		WebElement ele1=d.findElement(b1);
		ele1.sendKeys("admin123");
		
		Thread.sleep(3000);
		

		By b2=By.xpath("//button[ text()=\" Login \"]");
		WebElement ele2=d.findElement(b2);
		ele2.click();
		

	}

}
