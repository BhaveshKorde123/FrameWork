package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Utility.ReadProperty;


public class LoginPage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Kite']")	private	WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="//div[@class='form-header text-center']") private WebElement	loginLabel;
	@FindBy(xpath="//input[@id='pin']")	private	WebElement	pinTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	@FindBy(xpath="//span[@class='nickname']") private WebElement nicknameLabel;
	
	public LoginPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void loginZerodhaApp() throws Throwable
	{	 
		userIdTextbox.sendKeys(ReadProperty.readPropertyFile("userId"));
		passwordTextbox.sendKeys(ReadProperty.readPropertyFile("passward"));
		loginBtn.click();
		Thread.sleep(1000);
		pinTextbox.sendKeys(ReadProperty.readPropertyFile("pin"));
		continueBtn.click();
	}
	
	public String verifyAppTitle()
	{
	  return driver.getTitle();
	}
	
	public String verifyKiteLabel()
	{
	  return loginLabel.getText();
	}
	
	public boolean verifyKiteLogo()
	{
	  return kiteLogo.isDisplayed();
	}
	
	
	public boolean verifyZerodhaLogo() 
		{
		    return zerodhaLogo.isDisplayed();
		}
}	

	
	
	
	


