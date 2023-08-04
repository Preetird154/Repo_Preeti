package orange_hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	static WebDriver driver = new ChromeDriver();

	public static void browser()
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}

}
