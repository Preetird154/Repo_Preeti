package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cyclos {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.cyclos.org/ui/home");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		By register=By.xpath("//a[@id=\"register-link\"]");
		WebElement Reg=d.findElement(register);
		Reg.click();
		
		Thread.sleep(2000);
		
		By img=By.xpath("(//button[@type=\"button\"])[2]");
		WebElement Img=d.findElement(img);
		//Img.click();
		Img.sendKeys("C:\\Users\\HP\\Downloads\\baby-tom-and-jerry-rqbceq5ruhjbnzn7.jpg");
		
		Thread.sleep(2000);
		
		By name=By.xpath("//input[@id=\"id_1\"]");
		WebElement Name=d.findElement(name);
		Name.sendKeys("Keerthi");
		
		Thread.sleep(2000);
		
		By l_name=By.xpath("//input[@id=\"id_2\"]");
		WebElement L_Name=d.findElement(l_name);
		L_Name.sendKeys("Keerthi");
		
		Thread.sleep(2000);
		
		By mail=By.xpath("//input[@id=\"id_3\"]");
		WebElement email=d.findElement(mail);
		email.sendKeys("keerthi@gmail.com");
		
		Thread.sleep(2000);
		
		By website=By.xpath("//input[@id=\"website\"]");
		WebElement Website=d.findElement(website);
		Website.sendKeys("www.google.com");
		
		Thread.sleep(2000);
		
		By gender=By.xpath("(//label[@class=\"custom-control-label\"])[1]");
		WebElement Gender=d.findElement(gender);
		Gender.click();
		
		Thread.sleep(2000);
		
		By b=By.xpath("//button[@id=\"business_type\"]");
		WebElement B=d.findElement(b);
		B.click();
		

}
