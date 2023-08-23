package Iframes;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_WebSite {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://ui.vision/demo/webtest/frames/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.switchTo().frame(0);

		By frame1=By.xpath("//input[@name=\"mytext1\"]");
		WebElement Frame1=d.findElement(frame1);
		Frame1.sendKeys("Keerthi");
		
		Thread.sleep(2000);
		
		d.switchTo().parentFrame();
		
		d.switchTo().frame(1);
		
		By frame2=By.xpath("//input[@name=\"mytext2\"]");
		WebElement Frame2=d.findElement(frame2);
		Frame2.sendKeys("Spoorthi");
		
		Thread.sleep(2000);
		
		d.switchTo().parentFrame();
		
		d.switchTo().frame(2);
		
		By frame3=By.xpath("//input[@name=\"mytext3\"]");
		WebElement Frame3=d.findElement(frame3);
		Frame3.sendKeys("ABCD");
		
        Thread.sleep(2000);
		
		d.switchTo().parentFrame();
		
		d.switchTo().frame(2).switchTo().frame(0);
	
		By frame3_1=By.xpath("(//div[@class=\"AB7Lab Id5V1\"])[2]");
		WebElement Frame3_1=d.findElement(frame3_1);
    	Frame3_1.click();
		
		Thread.sleep(2000);
		
		By frame3_2=By.xpath("(//div[@class=\"uHMk6b fsHoPb\"])[1]");
		WebElement Frame3_2=d.findElement(frame3_2);
		Frame3_2.click();
		
		Thread.sleep(2000);
		
		By frame3_3=By.xpath("//div[@class=\"MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R\"]");
		WebElement Frame3_3=d.findElement(frame3_3);
		Frame3_3.click();
		
		Thread.sleep(2000);
		
		By frame3_4=By.xpath("(//span[text()=\"Well, now I know :-)\"])[2]");
		WebElement Frame3_4=d.findElement(frame3_4);
		Frame3_4.click();
		
		Thread.sleep(2000);	
			
	    By next=By.xpath("	(//span[@class=\"l4V7wb Fxmcue\"])[2]");
	    WebElement Next=d.findElement(next);
	    Next.click();
	    
	    Thread.sleep(2000);	
	    
	    By frame3_5=By.xpath("//input[@class=\"whsOnd zHQkBf\"]");
	    WebElement Frame3_5=d.findElement(frame3_5);
	    Frame3_5.sendKeys("hi hello");
		
	    Thread.sleep(2000);	
	    
	    By frame3_6=By.xpath("//textarea[@class=\"KHxj8b tL9Q4c\"]");
	    WebElement Frame3_6=d.findElement(frame3_6);
	    Frame3_6.sendKeys("hi hello how are you");
		
	    Thread.sleep(2000);
	    
	    By submit=By.xpath("(//span[@class=\"l4V7wb Fxmcue\"])[2]");
	    WebElement Submit=d.findElement(submit);
	    Submit.click();
	    
	    Thread.sleep(2000);
	    
	    d.switchTo().parentFrame();
	    
	    d.switchTo().frame(0);
	    
	    By frame_4=By.xpath("//input[@name='mytext1']");
	    WebElement Frame_4=d.findElement(frame_4);
	    Frame_4.sendKeys("EFGH");
	}

}
