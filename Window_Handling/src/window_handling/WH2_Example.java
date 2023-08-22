package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH2_Example {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.salesforce.com/in/?ir=1");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentHandle=d.getWindowHandle();
		System.out.println("Parent Window - " + parentHandle);
		
		By start=By.xpath("(//a[@class=\"cta_button\"])[1]");
		WebElement Start=d.findElement(start);
		Start.click();
		
		Set<String> Handles = d.getWindowHandles();
		System.out.println(Handles);
		
		for (String handle : Handles) 
		{
			System.out.println(handle);
			if (!handle.equals(parentHandle))
			{
				d.switchTo().window(handle);
				By fname = By.xpath("//input[@name=\"UserFirstName\"]");
				WebElement Fname = d.findElement(fname);
				Fname.sendKeys("Keerthi");
				
				Thread.sleep(2000);
				
				By lname=By.xpath("//input[@name=\"UserLastName\"]");
				WebElement Lname=d.findElement(lname);
				Lname.sendKeys("ABCD");
				
				Thread.sleep(2000);
				
				By email=By.xpath("//input[@name=\"UserEmail\"]");
				WebElement Email=d.findElement(email);
				Email.sendKeys("ABCD@gmail.com");
					
				Thread.sleep(2000);
			    d.close();
			}
		}
		
		d.switchTo().window(parentHandle);
		
		By chat=By.xpath("//span[@id=\"helpButtonSpan\"]");
		WebElement Chat=d.findElement(chat);
		Chat.click();
		
	}

}
