package TestNG_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {

	static WebDriver driver;
	
	@Test(invocationCount = 2)
	private void email() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys("ASDFG");
		System.out.println("email verified");
	}
	@Test
	private void password() {
		System.out.println("password verified");
	}
	
}
