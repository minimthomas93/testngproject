package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test() {
	int x=10;
	int y=15;
	// if(x==y) {
	// System.out.println("test passed");
	// }
	// else {
	// System.out.println("test failed");
	// }

	//Assert.assertEquals(x,y);
	boolean status=true;
	//Assert.assertTrue(status);
	Assert.assertFalse(status);

	String s1="abc";
	String s2="abc";
	Assert.assertEquals(s1,s2,"String are not equal");

}
}
