package Base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
//This is demo changes done by bhavesh korde
public class TestBase {
	
	public static WebDriver driver;
	public void	initalization() throws Exception
	{
	  String browserValue = ReadProperty.readPropertyFile("browser"));
	if(browserValue.equals("chrome"))
	{
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	}
	
	else if(browserValue.equals("firefox"))
	{
	   WebDriverManager.firefoxdriver().setup();
	     driver	=new	FirefoxDriver();
	}
	else	if(browserValue.equals("edge"))
	{
	WebDriverManager.edgedriver().setup();
	driver	=	new	EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get(ReadProperty.readPropertyFile("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
}