package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Demo {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com");

	}

}
