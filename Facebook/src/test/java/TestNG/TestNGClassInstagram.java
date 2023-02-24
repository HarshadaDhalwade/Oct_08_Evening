package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomClasses2.LoginPage;

public class TestNGClassInstagram {
	WebDriver driverTest;
	  @BeforeSuite
	  public void test1(){
		  System.out.println("BeforeSuite2");  
	  }
	  @BeforeTest
	  public void test2(){
		  System.out.println("BeforeTest2");  }
	  
	@BeforeClass
	 public void lounchBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");	
		  driverTest = new ChromeDriver();
		  driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		 driverTest.manage().window().maximize();	
	  }

		@BeforeMethod
		 public void  goToSingUpForm() 
		  {
			 driverTest.get("https://www.instagram.com/accounts/login/");
		  }
		@Test
		 public void verifyEmailOrPssword()
		  { 
			 LoginPage  loginPage=new  LoginPage(driverTest);
			 loginPage.sendEmailOrPhoneNo();
			 loginPage.sendPassword();
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
		 @AfterSuite
		  public void test3(){
			  System.out.println("AfterSuite2");
			  
		  }
		  @AfterTest
		  public void test4(){
			  System.out.println("AfterTest2");
			  
		  }

}
