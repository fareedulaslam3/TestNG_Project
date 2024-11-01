package TestNG_projects;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	private void browserlaunch() {
		System.out.println("user launched the browser");
	}
	@Test(priority = -1)
	private void login() {
		System.out.println("login");
	}
	@Test(priority = 0)
	private void searchproduct() {
		System.out.println("user searching the product");
	}
}
