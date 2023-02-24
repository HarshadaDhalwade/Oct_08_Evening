package Assertion;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
		@BeforeClass
		 public void beforeClass()
		 
		  {
			  System.out.println(" Before Class");	
		  }
			
			
			@BeforeMethod
			 public void beforeMethod() 
			  {
				 System.out.println(" Before Method");
			  }

			@Test
			 public void test()
			  { 
				  System.out.println(" Test"); 
				  
					
				    String actualurl ="https://www.facebook.com/";
					String expectedURL="https://www.facebook.com/home";
					
					SoftAssert soft = new SoftAssert();
				//1.to campare data
				//2.create the result
				//3.apply the result on test method	
				//if actual data is EQUALS to expected data then test case is PASSED
				//if actual data is NOT EQUALS to expected data then test case is FALLEd
			
					soft.assertEquals(actualurl,expectedURL,"Homepage URL is not found");
			//1.to campare data
			//2.create the result

		 //if actual data is EQUALS to expected data then test case is PASSED
		  //if actual data is NOT EQUALS to expected data then test case is passed	
					soft.assertNotSame(actualurl, expectedURL, "Homepage URL is not found");
	      boolean result = actualurl.equals( expectedURL);
			
	    //2.create the result
	     // if result = ture then test case PASSED
	      // if result = FALSE then test case FALLED
	      Assert.assertTrue(result, "Homepage URL is not found");
	      
	      //2.create the result
	      // if result = ture then test case  FALLED
	       // if result = FALSE then test case passed
	      soft.assertFalse(result, "Homepage URL is not found");
	       
	      //Forcefully failed the test method
	    //  soft.fail();
	       
	       if(result=true)
	       {
	    	   
	       }
	       else
	       {
	    	 //  Assert.fail();
	       }
			 
			  }
			
			@AfterMethod
			  public void afterMethod()
			  {
				  System.out.println(" After Method");
			  }

			@AfterClass
			  public void afterClass()
			  {
				  System.out.println(" After Class");
			  }
			
			
}
