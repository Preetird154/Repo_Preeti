package window_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	static WebDriver driver= new ChromeDriver();

	public static void browser() throws InterruptedException
	{
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

}
