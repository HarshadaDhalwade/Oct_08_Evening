package TestNG;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG1 {
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

		// test2 is depends on test1 and test3
		//test2 will be excute if test1 and test3 is passed
		//test2 wii be skips if test1 and test3 is passed
		@Test(priority=0)
		 public void test1()
		  { 
			  System.out.println(" Test1");  
				//  Assert.fail();
		  }
		
		@Test(priority=3, dependsOnMethods = {"test1","test3"})
		 public void test2()
		  { 
			  System.out.println(" Test 2");  
		
		  }
		
		@Test(priority=3,timeOut =3000)//3000ms =3sec
		 public void test3() throws InterruptedException
		  { 
		    System.out.println(" Test 3"); 
		     Thread.sleep(5000);
		  }
		//to stop the test method from execution
		@Test(priority=1,enabled = false)
		 public void test4()
		  { 
			  System.out.println(" Test 4");  
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
