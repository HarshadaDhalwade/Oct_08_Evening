package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LicPomClass.LicHomePage;
import LicPomClass.LicOfIndiaPage;
import LicPomClass.LicOfIndianCustumerPortal;


public class Lic {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driverTest.manage().window().maximize();
		
		driverTest.get("https://licindia.in/");

		LicHomePage licHomePage = new LicHomePage(driverTest);
		licHomePage.clickOnLOginToCustumerportal();
		
		LicOfIndianCustumerPortal licOfIndianCustumerPortal =new LicOfIndianCustumerPortal(driverTest);
		licOfIndianCustumerPortal.clickOnNewRegisterButton();
		
		LicOfIndiaPage licOfIndiaPage=new LicOfIndiaPage(driverTest);
		licOfIndiaPage.clickOnPolicyNumber();
	
		licOfIndiaPage.clickOnInstalmentPrem();
	
		//licOfIndiaPage.clickOnBirthDate();
		licOfIndiaPage.clickOnBirthDate();
		//licOfIndiaPage.clickOnBirthMonth();
		//licOfIndiaPage.clickOnBirthYear();
		
		
		licOfIndiaPage.clickOnCountryCode();
		
		
		licOfIndiaPage.clickOnMobileNumber();
		
		licOfIndiaPage.clickOnEmailId();
		
	
		licOfIndiaPage.clickOnPassportNumber();
		
	
		licOfIndiaPage.clickOnPanNumber();
		
	
		licOfIndiaPage.clickOnGender();
		licOfIndiaPage.clickCheckBox();
		licOfIndiaPage.clicksignIn();

		
		
	}

}
