package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ForgottenPassword;
import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class Testclass {

	public static void main(String[] args) {
		System.out.println("Harshada");
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.facebook.com/");

		ForgottenPassword  forgottenPassword  = new ForgottenPassword (driverTest);
		forgottenPassword.getForgetWindowMessage();
		forgottenPassword.sendEmailOrMobileNumber();
		forgottenPassword.clickOnCancel();
		forgottenPassword.clickOnSearchButton();
		
		LoginOrSignUpPage  loginOrSignUpPage =new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.sendEmailOrPhoneNo();
		loginOrSignUpPage.sendPassword();
		loginOrSignUpPage.clickOnLoginButton();
		loginOrSignUpPage.clickOnForgetButton();
		loginOrSignUpPage.openSingUpPage();
		loginOrSignUpPage.clickOnCreatAPage();
		
		 SignUpPage signUpPage =new SignUpPage(driverTest);
		 signUpPage.clickOnCreateButton() ;
		 signUpPage.sendFirstname();
		 signUpPage.sendLastname();
		 signUpPage.sendMobileno();
		 signUpPage.sendNewPassword();
		 signUpPage.selectDay();
		 signUpPage.selectMonth();
		 signUpPage.selectYear();
		 signUpPage.clickOnFemaleButton();
		 signUpPage.clickOnMaleButton();
		 signUpPage.clickOnTermsPolicyButton();
		 signUpPage.clickOnPrivacypolicyButton();
		 signUpPage.clickOncookiesPolicy();
		 signUpPage. clickOnSignUpButton();
	}

}
