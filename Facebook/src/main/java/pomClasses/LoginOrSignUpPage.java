package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage{
		
	//	Variable : WebElement :Login Or Sign Up Page
		
		@FindBy (xpath = "//input[@type='text'] ")
		private WebElement emailOrPhoneNo;


		@FindBy (xpath = " //input[@type='password']")
		private WebElement passwaord;


		@FindBy (xpath = "button[@value='1'] ")
		private WebElement loginBtton;

		@FindBy (xpath = " //a[text()='Forgotten password?']")
		private WebElement forgetPsswordLink;


		@FindBy (xpath = "(//a[@role='button'])[2]")
		private WebElement createNewAccountButton;
		
		@FindBy (xpath = "//a[text()='Create a Page'] ")
		private WebElement createAPage;

		//Constructor : Initializaltion of WebElement : Login Or Sing Up Page
		
		public LoginOrSignUpPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Methods : Actions on WebElement : Login Or Sign Up Page
		public void sendEmailOrPhoneNo() {
			emailOrPhoneNo.sendKeys("harshada");
			emailOrPhoneNo.clear();
		}
		
		public void sendPassword() {
			passwaord.sendKeys("1234");
		}
		
	
		public void clickOnLoginButton() {
			forgetPsswordLink.click();
		}
		
		public void clickOnForgetButton() {
			loginBtton.click();
		}
		
		
		public void openSingUpPage() {
			createNewAccountButton.click();
		}
		
		public void clickOnCreatAPage() {
			createAPage.click();
		}
		
}
