package pomClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithFacebook {

	@FindBy(xpath="//input[@type='text']")
	private WebElement emailAddressAndPhone;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@value='1']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Forgotten account?']")
	private WebElement forgottenAccount;
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement signUpForFacebook;
	
	@FindBy(xpath="//span[text()='Not now']")
	private WebElement notnowLink;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
	public LoginWithFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

		//Methods: Action on webElement: Login or Sign Up Page
			
	public void sendEmailOrPhoneNo() 
		{
		 emailAddressAndPhone.sendKeys("Harshada");
				
		}
	public void sendpassword() 
		{
		password.sendKeys("1234");
		}
	
	public void clickOnLoginButton() 
	{
		loginButton.click();
	
	}
	public void clickOnForgottenAccountLink() 
	{
		forgottenAccount.click();
	
	}
	public void clickOnSignUpForFacebookLink() 
	{
		signUpForFacebook.click();
	
	}
	public void clickOnNotNowLink()
	{
		notnowLink.click();
	
	}
}
