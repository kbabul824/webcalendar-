package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	 public void softAssert(){
	 SoftAssert softAssertion= new SoftAssert();
	 System.out.println("softAssert Method Was Started");
	 softAssertion.assertTrue(false);
	 System.out.println("softAssert Method Was Executed");
	 softAssertion.assertAll();//because of this statement, the test will be displayed as failed
	 }
	 
	 @Test
	 public void hardAssert(){
	 System.out.println("hardAssert Method Was Started");
	 Assert.assertTrue(false);
	 System.out.println("hardAssert Method Was Executed");
	 }
}