package window_handling;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH_Example {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String parentHandle=d.getWindowHandle();
		System.out.println("Parent Window - " + parentHandle);
		
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		By button = By.xpath("//button[@id='newWindowBtn']");
		WebElement btn = d.findElement(button);
		btn.click();
		
		Thread.sleep(2000);
		
		Set<String> handles=d.getWindowHandles();
		
		for (String handle : handles) 
		{
			System.out.println(handle);
			if (!handle.equals(parentHandle))
			{
				d.switchTo().window(handle);
				By fname = By.id("firstName");
				WebElement Fname = d.findElement(fname);
				Fname.sendKeys("Keerthi");
				Thread.sleep(3000);
				d.close();
			}
		}
		
		d.switchTo().window(parentHandle);
		By textbox=By.id("name");
		WebElement txt=d.findElement(textbox);
		txt.sendKeys("ABCD");
		
		Thread.sleep(2000);
		d.quit();
	}
}
