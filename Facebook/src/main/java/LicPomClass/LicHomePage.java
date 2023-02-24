package LicPomClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Variable : WebElement :Login Or Sign Up Page
public class LicHomePage {
	
	@FindBy (xpath = "(//a[@href='/Home-(1)/Customer-Portal'])[1]")
	private WebElement loginToCustumerPortal;

		
	//Constructor : Initializaltion of WebElement : Login Or Sing Up Page
	
			public LicHomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
		
			}
			
			//Methods : Actions on WebElement : Login Or Sign Up Page
			
			
			public void clickOnLOginToCustumerportal()  {
			
				loginToCustumerPortal.click();
			}
			
		
		
			
}
