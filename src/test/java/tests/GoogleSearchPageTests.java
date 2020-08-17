//package tests;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.GoogleSearchPageObject;
//
//public class GoogleSearchPageTests {
//	
//	public static WebDriver driver=null;
//	
//	public static void main(String[] args) {
//		googleSearch();
//	}
//	
//	public static void googleSearch()
//	{
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://google.com");
//		
//		GoogleSearchPageObject googlePage=new GoogleSearchPageObject(driver);
//		googlePage.setTextInSearchBox("A B C D");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		googlePage.clickSearchBox();
//		driver.quit();
//		
//	}
//
//}
