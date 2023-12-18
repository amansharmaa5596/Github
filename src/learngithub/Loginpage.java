package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String URL = "https://bcln-001.sandbox.us01.dx.commercecloud.salesforce.com/on/demandware.store/Sites-marykayintouch-br-Site/pt_BR/Login-Show";
		driver.get(URL);
	
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).click();
		
		driver.close();

	}
}
