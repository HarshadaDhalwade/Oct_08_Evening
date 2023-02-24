package pomClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassword {
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement emailOrPhoneNo;
	
	@FindBy(xpath="(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abam _abb9 _abbr _abcm'])[4]")
	private WebElement sendLoginLink;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createANewAccount;
	
	@FindBy(xpath="//a[text()='Back to login']")
	private WebElement backToLogin;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
		public ForgottenPassword(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

			//Methods: Action on webElement: Login or Sign Up Page

		public void sendEmailOrPHoneNo() 
		{
			emailOrPhoneNo.sendKeys("123456");
				
		}
		public void clickOnSendLoginLink() 
		{
			sendLoginLink.click();;
				
		}
		public void clickOnCreateNewAccount() 
		{
			createANewAccount.click();;
				
		}
		public void clickOnBackToLogin() 
		{
			backToLogin.click();
				
		}
		
				
		
		
}
