package testngproject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

@Test
public void  assertion()
{
	// @Test

	// public void hardAssertion() {
	// System.out.println("testing");
	// Assert.assertEquals(1,2);
	// System.out.println("HarD Assertion Completed");
	// Assert.assertEquals(1, 1);
	// }
}
	@Test
	public void SoftAssertion() {
	System.out.println("testing");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(1,2);
	System.out.println("Softassert completed");
	sa.assertEquals(1,1);
	sa.assertAll();//mandatory
	

	}

}
