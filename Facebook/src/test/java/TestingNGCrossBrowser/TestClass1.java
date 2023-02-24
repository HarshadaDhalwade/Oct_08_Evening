package TestingNGCrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class TestClass1{
	
	WebDriver driver;
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) 
	{
	System.out.println(browserName);
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");	
		 driver = new ChromeDriver();
	}
	if(browserName.equals("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\harsh\\Downloads\\edgedriver_win64 (1)New\\msedgedriver.exe");
		   driver =new EdgeDriver();	
	}
	if(browserName.equals(" Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\FireFox Path\\geckodriver-v0.32.1-win32\\geckodriver.exe");	
		 driver = new FirefoxDriver();	
	}
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		  driver.get("https://www.facebook.com/");
		  LoginOrSignUpPage  loginOrSignUpPage =new LoginOrSignUpPage(driver);
		  loginOrSignUpPage.openSingUpPage();
		//ForgottenPassword  forgottenPassword  = new ForgottenPassword (driver);
		//	forgottenPassword.clickOnSearchButton();
	}
	@Test
	 public void verifyTesrmLink()
	  { 
		  SignUpPage signUpPage = new SignUpPage(driver);
		  signUpPage.clickOnTermsPolicyButton();
		  String url = driver.getCurrentUrl();
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
		  SignUpPage signUpPage = new SignUpPage(driver);
		  signUpPage.clickOncookiesPolicy();
		  String url = driver.getCurrentUrl();
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
		  SignUpPage signUpPage = new SignUpPage(driver);
		  signUpPage. clickOnPrivacypolicyButton();
		  String url = driver.getCurrentUrl();
		  if(url.equals("urll356"))
		  {
			  System.out.println("Pass");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }
	  }

			  @AfterTest
	  public void testD(){
		  System.out.println("AfterTest");
		  
	  }
	@AfterMethod
	  public void afterMethod()
	  {
		  System.out.println(" After Method");
		 //  driverTest.close();
	  }

	@AfterClass
	  public void afterClass()
	  {
		  System.out.println(" After Class");
	  }

	
}














	