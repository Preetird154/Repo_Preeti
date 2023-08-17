package Iframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	static WebDriver driver= new ChromeDriver();

	public static void browser() throws InterruptedException
	{
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

}
