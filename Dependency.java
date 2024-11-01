package TestNG_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependency {
	
	@Test
	private void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	}
@Test(dependsOnMethods ="browserlaunch")
	private void searchproduct() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("search product");
	}
	
}
