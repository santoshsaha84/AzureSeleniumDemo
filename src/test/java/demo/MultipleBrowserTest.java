package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	
	public WebDriver driver=null;
	
	@Parameters("browser")
	@BeforeTest	
	public void SetUp(String browser)
	{
		System.out.println("This is my browser :"+browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}	
		else if(browser.equalsIgnoreCase("firefox"))
	    {
			String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void GoogleSearchPage()
	{
		
		driver.get("https://google.com");
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
		
		
	}

}
