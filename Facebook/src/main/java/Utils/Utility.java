package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void TakingScreenshot(WebDriver driver, String screenshotname) throws IOException 
	{
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
		File dest =new File ("C:\\Users\\harsh\\OneDrive\\Pictures\\Velocity\\Test1.png");
	  // File dest=new File("./Screenshots/"+screenshotname+".png");
	   FileHandler.copy(screenshot,dest);
	}
	

}
	


