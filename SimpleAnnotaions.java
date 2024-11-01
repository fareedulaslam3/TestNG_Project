package TestNG_projects;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotaions {

	@BeforeSuite
	private void browserlaunch() {
		
		System.out.println("User Launch the browser");
	}
	@BeforeTest
	private void UrlLaunch() {
		
		System.out.println("User launch the url");
		
	}
	@BeforeClass	
	private void login() {
		System.out.println("User logged in ");
	}
	@BeforeMethod
	private void searchproduct() {
		System.out.println("iphone");
		
	}
	@Test
	private void selectproduct() {
		System.out.println("product selected");
	}
	@AfterMethod
	private void buyproduct() {
		System.out.println("user buy the product");
	}
	
	
	}

