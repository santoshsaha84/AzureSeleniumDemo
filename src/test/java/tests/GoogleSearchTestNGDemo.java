package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObject;

public class GoogleSearchTestNGDemo {
	
	 WebDriver driver=null;
	
	@BeforeTest
	public void Setup()
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	@Test
	public void googleSearch()
	{		
		driver=new ChromeDriver();
		driver.get("https://google.com");		
		GoogleSearchPageObject googlePage=new GoogleSearchPageObject(driver);
		googlePage.setTextInSearchBox("A B C D");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		googlePage.clickSearchBox();
		
		
	}

}
