package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {

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

	//priority keyword is use to maintain the execution
	//sequence of test method 
	
	@Test(priority=2)
	 public void test1()
	  { 
		  System.out.println(" Test 1");  
	  }
	
//priority is - then they  excute first
	/*@Test(priority=-2)
	 public void test5()
	  { 
		  System.out.println(" Test 1");  
	  }*/

	//if priority of 2 or more test method is same then 
	//execution in bet that method  will  be depends on
	//Alphabetical order of method name
	/*@Test(priority=2)
	 public void test1()
	  { 
		  System.out.println(" Test 1");  
	  }*/
	
   //default priority is zero (priority=0)
	@Test
	 public void test5()
	  { 
		  System.out.println(" Test 5");  
	  }
	//invocationCount is used to reapt the test method multiple time
	//default invocationCount = 1
	//invocationCount = 0 then test method no excute
	//invocationCount = -2 then test method no excute
	@Test(priority=0,invocationCount =3)
	 public void test2()
	  { 
		  System.out.println(" Test 2");  
	  }
	
	@Test(priority=3)
	 public void test3()
	  { 
		  System.out.println(" Test 3");  
	  }
	
	@Test(priority=1)
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
