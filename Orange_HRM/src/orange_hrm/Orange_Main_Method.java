package orange_hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Main_Method {
	public static void main(String[] args) throws InterruptedException{
		
		Login.browser();
		Thread.sleep(2000);

		Login.username();
		Thread.sleep(2000);
		
		Login.password();
		Thread.sleep(2000);
		
		Login.login();
		Thread.sleep(2000);
		
		Logout.profile();
		Thread.sleep(2000);
		
		Logout.logout();
		Thread.sleep(2000);
	}

}
