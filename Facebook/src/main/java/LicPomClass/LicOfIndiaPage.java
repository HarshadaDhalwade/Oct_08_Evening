package LicPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LicOfIndiaPage {
	
	@FindBy (xpath = "//input[@name='policyNumber']")
	private WebElement policyNumber;
	
	@FindBy (xpath = "//input[@name='premiumAmount']")
	private WebElement instalmentPrem;
	
	
	@FindBy (xpath = "//div[@id='da_datefield-1146-trigger-picker']")
	private WebElement birthDate;
	
//	@FindBy (xpath = "//input[@placeholder='DD/MM/YYYY']")
//	private WebElement birthmonth;
	
//	@FindBy (xpath = "//input[@placeholder='DD/MM/YYYY']")
//	private WebElement birthyear;
	
	@FindBy (xpath = "//div[@id='da_combo-1155-trigger-picker']")
	private WebElement countryCode;
	
	@FindBy (xpath = "//input[@id='da_textfield-1156-inputEl']")
	private WebElement mobileNumber;
	
	
	@FindBy (xpath = "//input[@name='emailId']")
	private WebElement emailId;
	
	@FindBy (xpath = "//input[@name='passportNumber']")
	private WebElement passportNumber;
	
	@FindBy (xpath = "//input[@name='panNumber']")
	private WebElement panNumber;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy (xpath = "//a[@href='#Login']")
	private WebElement signIn;
	
	//private WebDriver driver;
	public LicOfIndiaPage (WebDriver driver)//driver=driverTest=new ChromeDriver()
	{
		PageFactory.initElements(driver,this);
	//	this.driver=driver;
		
	}

	//Methods: Action on webElement: Login or Sign Up Page
	
	
	public void clickOnPolicyNumber() 
	{
		policyNumber.sendKeys("1234665");
		
	}
	
	public void clickOnInstalmentPrem() 
	{
		instalmentPrem.sendKeys("23232");
		
	}

	
	public void clickOnBirthDate() 
	{
		Select s=new Select(birthDate);
		s.selectByValue("25");
		
	}
//	public void clickOnBirthMonth() 
//	{
//		Select s=new Select(birthmonth);
//		s.selectByValue("jan");
		
//	}
//	public void clickOnBirthYear() 
//	{
//		Select s=new Select(birthyear);
//		s.selectByValue("1992");
		
//	}
	

	
	public void clickOnCountryCode() 
	{
		Select s=new Select(countryCode);
		s.selectByValue("091");
		
	}

	
	public void clickOnMobileNumber() 
	{
		mobileNumber.sendKeys("1234567891");
		
	}

	
	public void clickOnEmailId() 
	{
		emailId.sendKeys("lasdhfj@gmail.com");
		
	}

	
	public void clickOnPassportNumber() 
	{
		passportNumber.sendKeys("1234");
		
	}

	
	public void clickOnPanNumber() 
	{
		panNumber.sendKeys("528");
		
	}

	
	public void clickOnGender() 
	{
		gender.click();
		
	}
	
	public void clickCheckBox() 
	{
	
		checkBox.isSelected();
		
	}
	
	public void clicksignIn() 
	{
		signIn.click();
		
	}
}
