package TestNG_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizedTest {
	
	static WebDriver driver;
	
	@BeforeClass
	
	private void fblaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");

	}
	
	@Parameters({"a","b"})
	@Test
	
private void login(String a,String b) {
	
	driver.findElement(By.id("email")).sendKeys(a);
	driver.findElement(By.id("pass")).sendKeys(b);
}
	
	

}
