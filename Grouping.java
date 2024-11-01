package TestNG_projects;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups="mobiles",dependsOnGroups = "laptops")
	private void samsung() {
		System.out.println("A14");
		
	}
	@Test(groups="mobiles",dependsOnGroups = "laptops")
	private void apple() {
		
		System.out.println("iphone 16 ");	
	}
	@Test(groups="mobiles",dependsOnGroups = "laptops")
	private void redmi() {
		System.out.println("Note 7");	
	}
	@Test(groups="laptops")
	private void MSI(){
		
		System.out.println("Cyborg 15");
		
	}
	@Test(groups="laptops")
	private void Asus() {
		System.out.println("Vivobook");
	}
	@Test(groups="laptops")
	private void  Apple() {
		System.out.println("Macbook M2");
	}
}
