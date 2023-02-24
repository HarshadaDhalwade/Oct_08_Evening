package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.ForgottenPassword;
import pomClasses.LoginOrSignUpPage;

public class TestNGClass2 {

	WebDriver driverTest;
		
		@BeforeClass
		 public void launchBrowser()
		 
		  {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");	
			  driverTest = new ChromeDriver();
			  driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			 driverTest.manage().window().maximize();	
		  }
			
			
			@BeforeMethod
			 public void openLoginOrSignUpPage() 
			  {
				 driverTest.get("https://www.facebook.com/");
				
			  }

			@Test
			 public void verifyEmailOrPassword()
			  { 
				LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage(driverTest);
				loginOrSignUpPage.sendEmailOrPhoneNo();
				loginOrSignUpPage.sendPassword();
				loginOrSignUpPage.clickOnLoginButton();
				
				
			   ForgottenPassword forgottenPassword =new ForgottenPassword(driverTest);
				forgottenPassword.getForgetWindowMessage();
				forgottenPassword.clickOnSearchButton();
				 //forgottenPassword.clickOnCancel();
				
				driverTest.navigate().back();
				
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
				//  driverTest.quit();
			  }
	
}
