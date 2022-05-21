package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestClass1 {
	@BeforeSuite
	public void bs() {
		System.out.println("TestClass1: Before Suite");
	}

	@BeforeTest
	public void bt() {
		System.out.println("TestClass1: Before Test");
	}

	@BeforeClass
	public void bc() {
		System.out.println("TestClass1: Before Class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("TestClass1: Before Method");
	}

	@Test
	public void test() {
		System.out.println("TestClass1: test");
	}

	@AfterMethod
	public void am() {
		System.out.println("TestClass1: After Method");
	}

	@AfterClass
	public void ac() {
		System.out.println("TestClass1: After Class");
	}
	@AfterTest
	public void at() {
		System.out.println("TestClass1: After Test");
	}
	@AfterSuite
	public void as() {
		System.out.println("TestClass1: After Suite");
	}
}

