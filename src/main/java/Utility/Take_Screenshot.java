package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot {
	
		public static void captureScreenshotFailedTC(WebDriver	driver,String methodName)	throws	Exception	
		{
		   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameBK\\Screenshot\\" +methodName+ ".png");
		   FileHandler.copy(source, dest);
		}
				
	}
	


