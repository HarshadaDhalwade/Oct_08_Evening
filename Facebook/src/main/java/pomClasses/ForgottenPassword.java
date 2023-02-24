package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassword {

//	Variable : WebElement :Login Or Sign Up Page
	
		@FindBy (xpath = "//div[text()='Please enter your email address or mobile number to search for your account.'] ")
		private WebElement forgotMessage;


		@FindBy (xpath = "(//input[@name='email'])[2]")
		private WebElement emailOrMobile;


		@FindBy (xpath = "//button[@type='submit']")
		private WebElement search;

		@FindBy (xpath = "(//a[@role='button']) [1] ")
		private WebElement cancel;

	       // @FindBy (xpath = "(//a[@role='button12345']) [1] ")
		//private WebElement cancel;
	
		//Constructor : Initializaltion of WebElement : Login Or Sing Up Page
		
		public ForgottenPassword (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Methods : Actions on WebElement : Login Or Sign Up Page
		public void getForgetWindowMessage() {
			String text = forgotMessage.getText();
			System.out.println(text);
		}
		
		public void sendEmailOrMobileNumber() {
			emailOrMobile.sendKeys("ffhgrfj");
		}
		
	
		public void clickOnCancel() {
			cancel.click();
		}
		
		public void clickOnSearchButton() {
			search.click();;
		}
		
		
		
		
}
