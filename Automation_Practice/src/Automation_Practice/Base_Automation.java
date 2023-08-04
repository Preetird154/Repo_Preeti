package Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Automation {
	
	static WebDriver d = new ChromeDriver();

	public static void browser()
	{
		d.get("https://www.automationexercise.com");
		d.manage().window().maximize();
	}

}
