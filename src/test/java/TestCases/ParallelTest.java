package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
		WebDriver driver=new ChromeDriver();
		
		@Test
		public void openFB()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\FrameBK\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.close();
		}
		
		@Test
		public void openGoogle()
		{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\FrameBK\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  WebDriverManager.chromedriver().setup();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.co.in/");
//		  driver.close();
		}
		
		@Test
		public	void	openRediff()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\FrameBK\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.close();
		}
		
		@Test
		public void	openKite()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\FrameBK\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
//		driver.close();
		}
		
		

}
