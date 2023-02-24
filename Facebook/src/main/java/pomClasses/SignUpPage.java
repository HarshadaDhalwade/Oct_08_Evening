package pomClasses;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	 public class SignUpPage {
		@FindBy (xpath = "(//a[@role='button'])[2]")
		private WebElement createNewAccountButton;
		
		
		@FindBy (xpath = "//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy (xpath = "//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy (xpath = "//input[@aria-label='Mobile number or email address']")
		private WebElement mobileNo;
		
		@FindBy (xpath = "(//input[@type='password'])[2]")
		private WebElement newPassword;
		
		@FindBy (xpath = "//select[@aria-label='Day']")
		private WebElement dayOfBirth;
		
		@FindBy (xpath = "//select[@aria-label='Month']")
		private WebElement monthOFBirth;
		
		@FindBy (xpath = "//select[@aria-label='Year']")
		private WebElement yearOfBirth;
		
		@FindBy (xpath = "(//input[@type='radio'])[1]")
		private WebElement femaleButton;
		
		@FindBy (xpath = "(//input[@type='radio'])[2]")
		private WebElement maleButton;
		
		@FindBy (xpath = "(//input[@type='radio'])[3]")
		private WebElement customButton;
		
		@FindBy (xpath = "(//a[@id='terms-link'])")
		private WebElement termsPolicy;
	
		@FindBy (xpath = "(//a[text()='Privacy Policy'])[2]")
		private WebElement privacyPolicy;
		
		@FindBy (xpath = "//a[text()='Cookies Policy']")
		private WebElement cookiesPolicy;
		
		@FindBy (xpath = "(//button[@type='submit'])[2]")
		private WebElement signUp;
		
		private WebDriver driver;
		private Actions action;
		private JavascriptExecutor javascriptExecutor;
		
		//Constructor: Initialization of webElement: Login or Sign up Page
		
				public SignUpPage(WebDriver driver)//driver=driverTest=new ChromeDriver()
				{
					PageFactory.initElements(driver,this);
					this.driver=driver;
					action=new Actions(this.driver);
					javascriptExecutor =(JavascriptExecutor)driver;
				}

				//Methods: Action on webElement: Login or Sign Up Page
				
				
				public void clickOnCreateButton() 
				{
					createNewAccountButton.click();
					
				}
				public void sendFirstname() 
				{
					firstName.sendKeys("1234");
					
				}
				public void sendLastname()
				{
					//JavascriptExecutor javaScriptExecutor=(JavascriptExecutor)driver;
					javascriptExecutor.executeScript("argument[0].scrollIntoView(true)",lastName );
					lastName.sendKeys("asd");
					
				}
				public void sendMobileno() 
				{
					mobileNo.sendKeys("123456788");
					
				}

				public void sendNewPassword()
				{
					newPassword.sendKeys("asd");
					
				}

				public void selectDay()
				{
					Select s=new Select(dayOfBirth);
					s.selectByValue("25");
				}

				public void selectMonth() 
				{
					Select s=new Select(monthOFBirth);
					s.selectByValue("jan");
					
				}

				public void selectYear() 
				{
					Select s= new Select(yearOfBirth);
					s.selectByValue("2000");
					
				}

				public void clickOnFemaleButton() 
				{
				//	Actions act=new Actions(driver);
					action.moveToElement(femaleButton).click().build().perform();
					
				}

				public void clickOnMaleButton() 
				{
					action.moveToElement(maleButton).click().build().perform();
					
				}

				public void clickOnCustombutton() 
				{
					action.moveToElement(customButton).click().build().perform();
					
				}
				
				public void clickOnTermsPolicyButton() 
				{
					termsPolicy.click();
					
				}

				public void clickOnPrivacypolicyButton() 
				{
					WebDriverWait wait = new WebDriverWait(driver,20);//20sec
					wait.until(ExpectedConditions.visibilityOfAllElements( privacyPolicy));
				    privacyPolicy.click();
				}
				
				public void clickOncookiesPolicy() 
				{
					cookiesPolicy.click();
					WebDriverWait wait = new WebDriverWait(driver,20);//20sec
					wait.until(ExpectedConditions.visibilityOfAllElements(cookiesPolicy));
					cookiesPolicy.click();
					
				}

				public void clickOnSignUpButton() 
				{
					signUp.click();
					
				}
				
}
