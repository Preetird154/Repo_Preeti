package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class implicitWait extends Base_Class {
	
	static By txtbx1=By.xpath("//button[@id=\"btn1\"]");
	static By enter1=By.xpath("(//input[@id=\"txt1\"])[1]");
	static By txtbx2=By.xpath("//button[@id=\"btn2\"]");
	static By enter2=By.xpath("(//input[@id=\"txt2\"])[1]");

	
	public static  WebElement clicktextbox1()
	{
		WebElement txt1=driver.findElement(txtbx1);
		return txt1;
	}
	
	public static  WebElement clicktextbox2()
	{
		WebElement txt2=driver.findElement(txtbx2);
		return txt2;
	}
	
	public static WebElement enterText1()
	{
		WebElement Enter1=driver.findElement(enter1);
		return Enter1;
	}
	
	public static WebElement enterText2()
	{
		WebElement Enter2=driver.findElement(enter2);
		return Enter2;
	}
	
	public static void clicktxt1()
	{
		clicktextbox1().click();
	}
	
	public static void clicktxt2()
	{
		clicktextbox2().click();
	}
	
	public static void gettext1()
	{
		enterText1().sendKeys("Hello");
	}
	
	public static void gettext2()
	{
		enterText2().sendKeys("Good");
	}

}
