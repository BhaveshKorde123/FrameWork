package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase {
	
	@FindBy(xpath="//span[@class='nickname']")private WebElement nicknameLabel;
	@FindBy(xpath="//span[@class='user-id']")private WebElement userIdLabel;
	@FindBy(xpath="//h4[@class='username']")private WebElement usernameLabel;
	@FindBy(xpath="//div[@class='email']")private WebElement emailLabel;
	@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logoutLink;

	@FindBy(xpath="//span[@class='user-id']")private WebElement userIdClick;
	
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyNickName() 
	{
		return nicknameLabel.getText();
	}
	
	public String verifyUserId() 
	{
		userIdClick.click();
		return userIdLabel.getText();
	}
	
	public String verifyUsername() 
	{
		userIdClick.click();
		return usernameLabel.getText();
	}
	
	public String verifyEmail() 
	{
		userIdClick.click();
		return emailLabel.getText();
	}
	
	public void clickLogoutLink() 
	{
		userIdClick.click();
		logoutLink.click();
	}

	
		
}
	
	


