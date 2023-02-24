package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LicPomClass.LicHomePage;
import LicPomClass.LicOfIndianCustumerPortal;




public class TestNGClassForLic {
	
		WebDriver driverTest;
		@BeforeClass
		 public void lounchBrowser()
		 
		  {

			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32 (2)New\\chromedriver.exe");	
			  driverTest = new ChromeDriver();
			  driverTest.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			 driverTest.manage().window().maximize();	
		  }
			
			
			@BeforeMethod
			 public void  goToSingUpForm() 
			  {
				 driverTest.get("https://licindia.in/");
			  }

			@Test
			 public void verifyLOginToCustumerportalButton()
			  { 

				LicHomePage licHomePage = new LicHomePage(driverTest);
				licHomePage.clickOnLOginToCustumerportal();
				
		//	LicOfIndianCustumerPortal licOfIndianCustumerPortal =new LicOfIndianCustumerPortal(driverTest);
		//	licOfIndianCustumerPortal.clickOnNewRegisterButton();
				
				//LicOfIndiaPage licOfIndiaPage=new LicOfIndiaPage(driverTest);
				//licOfIndiaPage.clickOnPolicyNumber();
			
			//	licOfIndiaPage.clickOnInstalmentPrem();
			//	licOfIndiaPage.clickOnBirthDate();
			//	licOfIndiaPage.clickOnBirthDate();
			//	licOfIndiaPage.clickOnBirthMonth();
			//	licOfIndiaPage.clickOnBirthYear();
			//licOfIndiaPage.clickOnCountryCode();
			//	licOfIndiaPage.clickOnMobileNumber();
			//licOfIndiaPage.clickOnEmailId();
			//	licOfIndiaPage.clickOnPassportNumber();
			//	licOfIndiaPage.clickOnPanNumber();
			//	licOfIndiaPage.clickOnGender();
			//	licOfIndiaPage.clickCheckBox();
				//licOfIndiaPage.clicksignIn();
			//	driverTest.navigate().back();
	
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
