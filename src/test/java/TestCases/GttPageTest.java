package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.GttPage;
import Pages.LoginPage;

public class GttPageTest extends TestBase {
	
	LoginPage login;
	GttPage gtt;
	DashBoardPage dash;
	
    @BeforeMethod
    public void setup() throws Throwable
    {
    	initalization();
    	gtt=new GttPage();
    	login=new LoginPage(); 
    	login.loginZerodhaApp();	
    }
		
    @Test
    public void PlaceGttOrderTest() throws Exception 
    {
    	gtt.placeGttOrder();
    }
    
    
    @AfterMethod
    public void exit()
    {
    	driver.close();
    }
}
	
	
	

