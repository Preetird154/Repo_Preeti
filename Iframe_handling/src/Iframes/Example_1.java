package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example_1 extends Example{
	
	static By Run=By.xpath("//button[@id='runbtn']");
	
	public static WebElement getRun()
	{
		driver.switchTo().parentFrame();
		WebElement run=driver.findElement(Run);
		return run;
	}
	
	public static void run()
	{
		getRun().click();
	}
	

}
