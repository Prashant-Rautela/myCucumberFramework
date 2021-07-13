package myStepDefinitionsPackage;

import org.testng.annotations.Test;

public class testClass {
	
	@Test
	public void test() {
		System.out.println("added with myBranch checkout");
	}

	
	@Test
	public void test1() {
		System.out.println("another method added");
	}
	
	@Test
	public void stashTesting() {
		System.out.println("this is done after stashing my home branch");
	}
	
	@Test
	public void fetchTesting() {
		System.out.println("this is fetch command testing");
	}
}
