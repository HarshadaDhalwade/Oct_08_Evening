package pomClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	@FindBy(xpath="//button[text()='Log in with Facebook']")
	private WebElement loginWithFacebooAccount; 
	
	@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//input[@aria-label='Full Name']")
	private WebElement fullName;
	
	@FindBy(xpath="//input[@aria-label='Username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUpButton;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement logInButton;

	
	@FindBy(xpath="//p[text()='Have an account? ']")
	private WebElement haveAnAccountMessage;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
		public SignUp(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

			//Methods: Action on webElement: Login or Sign Up Page
				
		public void sendLoginWithFacebooAccount() 
			{
			loginWithFacebooAccount.click();
					
			}
		public void sendMobileNo() 
		{
			mobileNo.sendKeys("123456");
				
		}
		public void sendFullName() 
		{
			fullName.sendKeys("pranita kale");
				
		}
		public void sendUserName() 
		{
			userName.sendKeys("pranita");
				
		}
		public void sendPassword() 
		{
			password.sendKeys("1234");
				
		}
		public void clickOnSignUpButton() 
		{
			signUpButton.click();
				
		}
		public void clickOnLogInButton() 
		{
			logInButton.click();
				
		}
		public void getAccountMessage()
		{
			String text= haveAnAccountMessage.getText();
			System.out.println(text);
		}
}
