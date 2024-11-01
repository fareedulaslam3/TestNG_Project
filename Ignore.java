package TestNG_projects;

import org.testng.annotations.Test;

public class Ignore {
	@Test
	private void Flipcart() {
		
		System.out.println("login");
		
	}
	@Test
	//@org.testng.annotations.Ignore
		private void ad_popup() {
			System.out.println("ad popup");
		}
	@Test(enabled=false)
	private void productsearch() {
		System.out.println("search product");
	}
	}


