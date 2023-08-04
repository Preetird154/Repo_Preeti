package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Login {

	static By profile = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
	static By logout = By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]");

	static WebElement Profile = driver.findElement(profile);
	static WebElement Logout = driver.findElement(logout);

	public static void profile() 
	{
		Profile.click();
	}
	
	public static void logout() 
	{
		Logout.click();
	}

}
