package first.my;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SecondTest {
	
		First sc = new First();
		@Test
		public void TestFirst() {
			// String str = "first";

			Assert.assertEquals("first", sc.first());
			System.out.println("A");
		}
		@Test	
		public void TestSecond() {
			
			Assert.assertEquals("first", sc.first());
			System.out.println("B");
		}
		@Test
		public void TestThird() {
			
			Assert.assertEquals("first", sc.first());
			System.out.println("C");
		}
	}

