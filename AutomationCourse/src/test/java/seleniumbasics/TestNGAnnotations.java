package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@Test
	public void sampleTestCase() {
		System.out.println("sample testcase");
		
	}
	 @BeforeMethod
	public void beforeMethod() {
		System.out.println("sample before method");
	}
	 @AfterMethod
	 public void afterMethod() {
		 System.out.println("sample after method");
	 }
	 @BeforeClass
	 public void beforeClass() {
		 System.out.println("sample before class");
	 }
	 @AfterClass
	 public void afterClass() {
		 System.out.println("sample after class");
	 }
	 @BeforeTest
	 public void beforeTest() {
		 System.out.println("sample before test");
	 }
	 @AfterTest
	 public void afterTest() {
		 System.out.println("sample after test");
	 }
	 @BeforeSuite
	 public void beforeSuite() {
		 System.out.println("sample before suite");
	 }
	 @AfterSuite
	 public void aftersuite() {
		 System.out.println("sample after suite");
	 }

}
