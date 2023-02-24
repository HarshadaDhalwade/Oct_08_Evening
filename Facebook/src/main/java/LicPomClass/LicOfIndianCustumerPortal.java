package LicPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicOfIndianCustumerPortal {

	
		//Variable : WebElement :Login Or Sign Up Page
		
				@FindBy (xpath = "(//a [@class='button'])[1]")
				private WebElement newRegister;


				@FindBy (xpath = "(//a[@class='button'])[2]")
				private WebElement registerUser;

				
				//Constructor : Initializaltion of WebElement : Login Or Sing Up Page
				
				public LicOfIndianCustumerPortal(WebDriver driver) {
							PageFactory.initElements(driver, this);
						
						}
						
				//Methods : Actions on WebElement : Login Or Sign Up Page
						
					public void clickOnNewRegisterButton() {
							newRegister.click();
						}
						
						
					public void clickOnRegisterUser()  {
							registerUser.click();	
					
						}
						
					
}
