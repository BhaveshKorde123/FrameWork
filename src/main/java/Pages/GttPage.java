package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class GttPage extends TestBase {
	
	@FindBy(xpath="//a[@class='orders-nav-item']")private WebElement orderHBtn;
	@FindBy(xpath="//span[text()='GTT']")private WebElement gttBtn;
	@FindBy(xpath="//button[text()='New GTT ']")private WebElement newGttBtn;
	@FindBy(xpath="(//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx'])[2]")private WebElement searchShare ;
	@FindBy(xpath="//span[text()='STATE BANK OF INDIA ']")private WebElement sbiShare;
	@FindBy(xpath="//button[text()='Buy ']")private WebElement buyBtn ;
	@FindBy(xpath="//input[@step=\"1\"]")private WebElement quntity ;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement setPrice;
	@FindBy(xpath="(//span[text()='Buy'])[2]")private WebElement buyBtn2;
	@FindBy(xpath="//span[text()='Cancel']")private WebElement cancel;
	@FindBy(xpath="//button[text()='Cancel ']")private WebElement cancelBtn2 ;
	@FindBy(xpath="	//button[text()='Close ']")private WebElement closeBtn ;
	@FindBy(xpath="//label[text()='SL']")private WebElement slRadioBtn;
	@FindBy(xpath="//label[text()='Limit']")private WebElement lmitRadioBtn;
	
	public GttPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void placeGttOrder() throws Exception
	{
		 orderHBtn.click();
		lmitRadioBtn.click();
		gttBtn.click();
		newGttBtn.click();
		searchShare.sendKeys("sbi");
		sbiShare.click();
		 buyBtn.click();
         Thread.sleep(1000);
		setPrice.sendKeys("532");
		 Thread.sleep(1000);
		 quntity.sendKeys("100");
		 cancelBtn2.click();
		 closeBtn.click();
	}
	
}
