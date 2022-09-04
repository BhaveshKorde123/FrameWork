package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;
import Utility.Take_Screenshot;

public class CaptureScreenshot extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod	
	public void	setup()	throws Exception
	{
	  initalization();
	  login=new	LoginPage();
	}
	
	@Test	
	public void	verifyAppTitleTest()
	{
	String expTitle	= "2Kite - Zerodha's fast and elegant flagship trading platform";
	String actTitle	= login.verifyAppTitle();
	Assert.assertEquals(actTitle, expTitle,"Title	is	wrong");
	}
	
	@Test	
	public void	verifyKiteLabelTest()	
	{
	String actLabel=login.verifyKiteLabel();
	Assert.assertEquals(actLabel,"2Login to Kite");
	}
	
	@AfterMethod	
	public void	exit(ITestResult z)	throws	Exception	
	{
	   if(ITestResult.FAILURE == z.getStatus())
	   {
	      Take_Screenshot.captureScreenshotFailedTC(driver, z.getName());
	   }
	   
	 driver.quit();
	}
	

}
