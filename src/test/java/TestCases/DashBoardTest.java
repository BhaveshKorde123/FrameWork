package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardTest extends TestBase {
	
	DashBoardPage dash;
	 LoginPage login;
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initalization();
	  login=new LoginPage();
	  dash=new DashBoardPage();
	   login.loginZerodhaApp();	  
	}
	
	@Test	(groups	=	"Sanity")
	public	void	verifyNicknameTest()	throws	Throwable
	{
	String	value	=	dash.verifyNickName();
	System.out.println(value);
	}
	@Test	(groups	=	"Sanity")
	public	void	verifyUserIdTest()
	{
	String	value	=	dash.verifyUserId();
	System.out.println(value);
	}
	@Test	(groups	=	{"Regression","Sanity"})
	public	void	verifyEmailIdTest()
	{
	String	value	=	dash.verifyEmail();
	System.out.println(value);
	}
	@Test	(groups	=	"Functional")
	public	void	verifyUsernameTest()
	{
	String	value	=	dash.verifyUsername();
	System.out.println(value);
	}
	@AfterMethod	(groups	=	{"Sanity","Regression","Functional"})
	public	void	exit()
	{
	driver.close();
	}

}
