package first.my;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleClass {
	First sc = new First();
	@Test
	public void TestFirst() {
		// String str = "first";

		Assert.assertEquals("first", sc.first());
		System.out.println("1");
	}
	@Test	
	public void TestSecond() {
		
		Assert.assertEquals("first1", sc.first());
		System.out.println("2");
	}
	@Test
	public void TestThird() {
		
		Assert.assertEquals("first", sc.first());
		System.out.println("3");
	}
}
