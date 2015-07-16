package first.my;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleClass {
	First sc = new First();
	
	@Test  (groups = {"integer"})
	public void TestFirst() {
		// String str = "first";

		Assert.assertEquals("first", sc.first());
		System.out.println("1");
	}
	@BeforeClass	(groups = {"integer"})
	public void TestSecond() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("2");
	}
	@AfterClass (groups = {"integer"})
	public void TestThird() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("3");
	}
	
	@BeforeGroups (groups = {"unit"})
	public void TestA() {
		// String str = "first";

		Assert.assertEquals("first", sc.first());
		System.out.println("1A");
	}
	@AfterGroups	(groups = {"unit"})
	public void TestB() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("2B");
	}
	@BeforeMethod (groups = {"unit"})
	public void TestD() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("3D");
	}
	@AfterMethod (groups = {"unit"})
	public void TestF() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("3F");
	}
}
