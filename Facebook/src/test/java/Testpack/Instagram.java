package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses2.ForgottenPassword;
import pomClasses2.LoginPage;
import pomClasses2.LoginWithFacebook;
import pomClasses2.SignUp;

public class Instagram {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driverTest=new ChromeDriver();
driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
driverTest.manage().window().maximize();


driverTest.get("https://www.instagram.com/accounts/login/");

LoginPage loginPage=new LoginPage(driverTest);
loginPage.sendEmailOrPhoneNo();
loginPage.sendPassword();
loginPage.clickOnLoginButton(); 
loginPage.clickOnFacebookLink();
loginPage.clickOnForgotpasswordLink(); 
loginPage.clickOnSignPage();


//instragram forgotpassword
ForgottenPassword forgottenPassword=new ForgottenPassword(driverTest);
//instragramForgotPassword3.sendForgotpassword(); 
forgottenPassword.sendEmailOrPHoneNo(); 
forgottenPassword.clickOnSendLoginLink();
forgottenPassword.clickOnCreateNewAccount();
forgottenPassword.clickOnBackToLogin();

//Instragram loginwithFacebook
LoginWithFacebook loginWithFacebook1=new LoginWithFacebook(driverTest);
loginWithFacebook1.sendEmailOrPhoneNo();
loginWithFacebook1.sendpassword();
loginWithFacebook1.clickOnLoginButton();
loginWithFacebook1.clickOnForgottenAccountLink();
loginWithFacebook1.clickOnSignUpForFacebookLink();
loginWithFacebook1.clickOnNotNowLink();

//Instragram SignupPage
SignUp signUp=new SignUp(driverTest);
signUp.sendLoginWithFacebooAccount();
signUp.sendMobileNo();
signUp.sendFullName();
signUp.sendUserName();
signUp.sendPassword();
signUp.clickOnSignUpButton();
signUp.clickOnLogInButton();

	}

}
