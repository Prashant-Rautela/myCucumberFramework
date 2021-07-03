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
	public void masterbranch() {
		System.out.println("This code change is only at master branch");
	}
}
