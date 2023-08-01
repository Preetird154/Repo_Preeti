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
		
		Thread.sleep(2000);
		
		By sel=By.xpath("//a[@id=\"business_type_clothing\"]");
		WebElement select=d.findElement(sel);
		select.click();
		
		Thread.sleep(2000);
		
		By num=By.id("id_4");
		WebElement number=d.findElement(num);
		number.sendKeys("8134567892");
		
		Thread.sleep(2000);
		
//		By eye=By.xpath("(//button[@class=\"btn btn-icon d-flex align-content-center\"])[4]");
//		WebElement Eye=d.findElement(eye);
//		Eye.click();
		
		//Thread.sleep(2000);
		
//		By land_line=By.id("id_5");
//		WebElement Land_Line=d.findElement(land_line);
//		Land_Line.sendKeys("08413");
//		
//		Thread.sleep(2000);
		
		By e=By.xpath("(//label[@class=\"custom-control-label\"])[3]");
		WebElement E=d.findElement(e);
		E.click();
		
		Thread.sleep(2000);
		
		By address=By.xpath("//input[@id=\"addressLine1\"]");
		WebElement Address=d.findElement(address);
		Address.sendKeys("BTM Layout");
		
		Thread.sleep(2000);
		
		By zip=By.xpath("//input[@id=\"zip\"]");
		WebElement Zip=d.findElement(zip);
		Zip.sendKeys("560076");
		
		Thread.sleep(2000);
		
		By city=By.xpath("//input[@id=\"city\"]");
		WebElement City=d.findElement(city);
		City.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		By state=By.xpath("//input[@id=\"region\"]");
		WebElement State=d.findElement(state);
		State.sendKeys("Karnataka");
		
		Thread.sleep(2000);
		
		By country=By.xpath("//button[@id=\"country\"]");
		WebElement Country=d.findElement(country);
		Country.click();
		
		Thread.sleep(2000);
		
		By sel1=By.xpath("//a[@id=\"country_IN\"]");
		WebElement select1=d.findElement(sel1);
		select1.click();
		
		Thread.sleep(2000);
		
		By next=By.xpath("//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]");
		WebElement Next=d.findElement(next);
		Next.click();
		
		Thread.sleep(2000);
		
		By password=By.xpath("//input[@id=\"id_7\"]");
		WebElement Password=d.findElement(password);
		Password.sendKeys("5534");
		
		Thread.sleep(2000);
		
		By Re_pass=By.xpath("//input[@id=\"id_8\"]");
		WebElement Re_Pass=d.findElement(Re_pass);
		Re_Pass.sendKeys("5534");
		
		Thread.sleep(2000);
		
		By a=By.xpath("//label[@class=\"custom-control-label\"]");
		WebElement A=d.findElement(a);
		A.click();
		
		Thread.sleep(2000);
		
		By captcha=By.xpath("//span[@class=\"recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked\"]");
		WebElement Captcha=d.findElement(captcha);
		Captcha.click();
		
		Thread.sleep(2000);
		
		By submit=By.xpath("//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]");
		WebElement Submit=d.findElement(submit);
		Submit.click();
	}
}
