package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		d.manage().window().maximize();
		
		By f_name=By.name("firstname");
		WebElement F_name=d.findElement(f_name);
		F_name.sendKeys("Keerthi");
		
		Thread.sleep(2000);
		
		By l_name=By.name("lastname");
		WebElement L_name=d.findElement(l_name);
		L_name.sendKeys("R D");
		
		Thread.sleep(2000);
		
		By gender=By.xpath("//input[@id=\"sex-1\"]");
		WebElement Gender=d.findElement(gender);
		Gender.click();
		
		Thread.sleep(2000);
		
		By exp=By.xpath("//input[@id=\"exp-0\"]");
		WebElement Exp=d.findElement(exp);
		Exp.click();
		
		Thread.sleep(2000);
		
		By date=By.xpath("//input[@id=\"datepicker\"]");
		WebElement Date=d.findElement(date);
		Date.sendKeys("31/07/2023");
		
		Thread.sleep(2000);
		
		By rad=By.xpath("//input[@id=\"profession-1\"]");
		WebElement Rad=d.findElement(rad);
		Rad.click();
		
		Thread.sleep(2000);
		
		By a=By.xpath("//input[@id=\"tool-0\"]");
		WebElement a1=d.findElement(a);
		a1.click();
		
		Thread.sleep(2000);
		
		By country=By.xpath("//select[@id=\"continents\"]");
		WebElement Country=d.findElement(country);
		Select sel=new Select(Country);
		sel.selectByVisibleText("Australia");
		
		Thread.sleep(2000);
		
		By comm=By.xpath("//select[@id=\"selenium_commands\"]");
		WebElement Command=d.findElement(comm);
		Select sel1=new Select(Command);
		sel1.selectByVisibleText("WebElement Commands");
		
		Thread.sleep(2000);
		
		By photo=By.xpath("//input[@id=\"photo\"]");
		WebElement Photo=d.findElement(photo);
		Photo.sendKeys("C:\\Users\\HP\\Downloads\\baby-tom-and-jerry-rqbceq5ruhjbnzn7.jpg");
		
		Thread.sleep(2000);
		
		By Button=By.xpath("//button[@id=\"submit\"]");
		WebElement button=d.findElement(Button);
		button.click();
	}

}
