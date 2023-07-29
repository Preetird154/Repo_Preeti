package selenium5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_WebSite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.automationexercise.com");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		//FOR LOGIN TO YOUR ACCOUNT
		
		By b1=By.xpath("//a[i[@class=\"fa fa-lock\"]]");
		WebElement e1=d.findElement(b1);
		e1.click();
		
		Thread.sleep(2000);
		
		By b2=By.xpath("//input[ @data-qa=\"login-email\"]");
		WebElement e2=d.findElement(b2);
		e2.sendKeys("abcd@gmail.com");
		
		Thread.sleep(2000);
		
		By b3=By.xpath("//input[ @data-qa=\"login-password\"]");
		WebElement e3=d.findElement(b3);
		e3.sendKeys("abcd@1234");
		
		Thread.sleep(2000);
		
		By b4=By.xpath("//button[ @data-qa=\"login-button\"]");
		WebElement e4=d.findElement(b4);
		e4.click();
		
		// FOR NEW USER SIGNUP
		
		By c1=By.xpath("//input[ @data-qa=\"signup-name\"]");
		WebElement d1=d.findElement(c1);
		d1.sendKeys("EFGH");
		
		Thread.sleep(2000);
		
		By c2=By.xpath("//input[ @data-qa=\"signup-email\"]");
		WebElement d2=d.findElement(c2);
		d2.sendKeys("efgh@1234");
		
		Thread.sleep(2000);
		
		By c3=By.xpath("//button[ @data-qa=\"signup-button\"]");
		WebElement d3=d.findElement(c3);
		d3.click();
		
		//FOR ENTER ACCOUNT INFORMATION (CREATE NEW ACCOUNT)
		
		By t=By.id("id_gender2");
		WebElement title=d.findElement(t);
		title.click();
		
		Thread.sleep(2000);
		
		By p=By.id("password");
		WebElement pw=d.findElement(p);
		pw.sendKeys("Abcd@1234");
		
		Thread.sleep(2000);
		
		By day=By.id("days");
		WebElement dy=d.findElement(day);
		Select sel=new Select(dy);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		By month=By.id("months");
		WebElement months=d.findElement(month);
		Select sel1=new Select(months);
		sel1.selectByVisibleText("February");
		
		Thread.sleep(2000);
		
		By year=By.id("years");
		WebElement years=d.findElement(year);
		Select sel2=new Select(years);
		sel2.selectByValue("2002");
		
		Thread.sleep(2000);
		
		By a=By.id("newsletter");
		WebElement b=d.findElement(a);
		b.click();
		
		Thread.sleep(2000);
		
		By a1=By.id("optin");
		WebElement c=d.findElement(a1);
		c.click();
		
		//ADDRESS INFORMATION
		
		By f_name=By.id("first_name");
		WebElement first_name=d.findElement(f_name);
		first_name.sendKeys("Keerthi");
		
		Thread.sleep(2000);
		
		By l_name=By.id("last_name");
		WebElement Last_name=d.findElement(l_name);
		Last_name.sendKeys("A B");
		
		Thread.sleep(2000);
		
		By comp=By.id("company");
		WebElement company=d.findElement(comp);
		company.sendKeys("XYZ company");
		
		Thread.sleep(2000);
		
		By add=By.id("address1");
		WebElement address=d.findElement(add);
		address.sendKeys("BTM Layout");
		
		Thread.sleep(2000);
		
		By ad=By.id("address2");
		WebElement address1=d.findElement(ad);
		address1.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		By con=By.id("country");
		WebElement country=d.findElement(con);
		Select s=new Select(country);
		s.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		By state=By.id("state");
		WebElement state1=d.findElement(state);
		state1.sendKeys("Karnataka");
		
		Thread.sleep(2000);
		
		By city=By.id("city");
		WebElement city1=d.findElement(city);
		city1.sendKeys("Bangalore");
		
		By zip=By.id("zipcode");
		WebElement zip_code=d.findElement(zip);
		zip_code.sendKeys("560076");
		
		Thread.sleep(2000);
		
		By num=By.id("mobile_number");
		WebElement mobile_num=d.findElement(num);
		mobile_num.sendKeys("1234567856");
		
		Thread.sleep(2000);
		
		By create=By.xpath("//button[@data-qa=\"create-account\"]");
		WebElement create_account=d.findElement(create);
		create_account.click();
	}
}
