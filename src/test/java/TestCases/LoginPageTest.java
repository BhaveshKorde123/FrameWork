package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod(groups="Sanity")
	public void setup() throws Exception 
	{
	    initalization();
	   login=new LoginPage();
	}
	
	@Test(priority=-1, groups="Sanity")
	public void verifyAppTitleTest()
	{
		String expTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle=login.verifyAppTitle();
		Assert.assertEquals(actTitle, expTitle,"Title is wrong");					
	}
	
	@Test(priority=1,groups="Regression")
	public void verifyKiteLabelTest()
	{
	    String actLabel=login.verifyKiteLabel();
	    String expLabel="Login to Kite";
	    Assert.assertEquals(actLabel, expLabel);                       
	}
	
	@Test
	public void	verifyKiteLogoTest()
	{
	     boolean result=login.verifyKiteLogo();
	     Assert.assertEquals(result, true);
//	     Assert.assertTrue(true);
//	     Assert.assertFalse(false);  
	}
	
	@Test(enabled=false, groups="Sanity")
	public void	verifyZerodhaLogoTest()
	{
	  boolean result=login.verifyZerodhaLogo();
	  Assert.assertEquals(result, true);
	}
		
	@Test(groups="Regression")
	public void loginZerodhaAppTest() throws Throwable
	{
	   login.loginZerodhaApp();
	}
	
	@AfterMethod(groups="Sanity")
	public void	exit()
	{
	    driver.quit();
	}
}


