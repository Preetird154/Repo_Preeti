package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Login {

	static By profile = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
	static By logout = By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]");

	
    public static WebElement GetProfile()
    {
    	WebElement Profile = driver.findElement(profile);
    	return Profile;
    }
    
    public static WebElement GetLogout()
	{
		WebElement Logout = driver.findElement(logout);
		return Logout;
	}
    
    
	public static void profile() 
	{
		GetProfile().click();
	}
	
	public static void logout() 
	{
		GetLogout().click();
	}

}
