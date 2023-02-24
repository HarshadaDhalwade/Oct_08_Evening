package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class TestNGClass {
	WebDriver driverTest ;
  
		@BeforeClass
	  public void launchBrowser()
	 { 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");	
			  driverTest = new ChromeDriver();
			  driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			 driverTest.manage().window().maximize();	
	  }
		
		
		@BeforeMethod
		  public void goToSingUpPage()
		  {
			 System.out.println(" Before Method");
			 driverTest.get("https://www.facebook.com/");
			 LoginOrSignUpPage  loginOrSignUpPage =new LoginOrSignUpPage(driverTest);
			loginOrSignUpPage.openSingUpPage();	
			
			//SignUpPage signUpPage =new SignUpPage(driverTest);
//		   signUpPage.clickOnCreateButton() ;
		  
		  }


		@Test
		 public void verifyTesrmLink()
		  { 
			  SignUpPage signUpPage = new SignUpPage(driverTest);
			  signUpPage.clickOnTermsPolicyButton();
			  String url = driverTest.getCurrentUrl();
			  if(url.equals("dfgthyh"))
			  {
				  System.out.println("Pass");
			  }
			  else
			  {
				  System.out.println("Fail");
			  }
		  }
		
		
		@Test

		 public void verifyCookiesPolicies()
		  { 
			  SignUpPage signUpPage = new SignUpPage(driverTest);
			  signUpPage.clickOncookiesPolicy();
			  String url = driverTest.getCurrentUrl();
			  if(url.equals("url112333"))
			  {
				  System.out.println("Pass");
			  }
			  else
			  {
				  System.out.println("Fail");
			  }
		  }
		
		@Test
		public void verifyPrivacyPolicies()
		  { 
			  SignUpPage signUpPage = new SignUpPage(driverTest);
			  signUpPage. clickOnPrivacypolicyButton();
			  String url = driverTest.getCurrentUrl();
			  if(url.equals("urll356"))
			  {
				  System.out.println("Pass");
			  }
			  else
			  {
				  System.out.println("Fail");
			  }
		  }

		@AfterMethod
		  public void afterMethod()
		  {
			  System.out.println(" After Method");
			  //driverTest.close();
			  
		  }

		@AfterClass
		  public void afterClass()
		  {
			  System.out.println(" After Class");
			//driverTest.quit();
		  } 

				  @AfterTest
		  public void testD(){
			  System.out.println("AfterTest");
			  
		  }
}
