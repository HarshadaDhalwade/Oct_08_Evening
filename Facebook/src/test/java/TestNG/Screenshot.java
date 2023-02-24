package TestNG;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Utility;

public class Screenshot {
	WebDriver driver;

	@BeforeTest
	  public void launchBrowser()
	  {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  driver.get("https://www.mayoclinic.org/");
		  driver.manage().window().maximize();
	  }
		
		
		
		@Test
		public void  VerifyWebTitle()
		{
			String ActualWebTitle=driver.getTitle();
			String ExpectedWebTitle="Maya Clinic - Mayo Clinicfew";
			Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
		}
		
		@AfterMethod
		public void Aftermethod(ITestResult result)throws IOException
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				
				File dest =new File ("C:\\Users\\harsh\\OneDrive\\Pictures\\Velocity\\Test1.png");
			   FileHandler.copy(screenshot, dest);
				Utility.TakingScreenshot(driver, result.getName());
				
			
			}
				
				
				
		}
}
