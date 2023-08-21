package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NXT_GEN {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://nxtgenaiacademy.com/iframe/");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By fname=By.xpath("//input[@name=\"vfb-5\"]");
		Thread.sleep(2000);
		WebElement Fname=d.findElement(fname);
		Fname.sendKeys("Keerthi");
	}

}
