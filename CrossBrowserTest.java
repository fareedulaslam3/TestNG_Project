package TestNG_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	@Test
	private void chrome() {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/?next=%2Fproud.mp%2Ffeed%2F&source=profile_feed_tab");
	}

	
	@Test
	private void internetexplorer() {
	WebDriverManager.iedriver().setup();
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.instagram.com/accounts/login/?next=%2Fproud.mp%2Ffeed%2F&source=profile_feed_tab");
}
}