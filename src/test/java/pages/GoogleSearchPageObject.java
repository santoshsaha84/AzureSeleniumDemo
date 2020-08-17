package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObject {
	
	
	WebDriver driver=null;
	By search_textbox=By.name("q");
	By search_button=By.name("btnK");
	
	public  GoogleSearchPageObject(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	public static WebElement element=null;
	
	public void setTextInSearchBox(String text)
	{		
		this.driver.findElement(search_textbox).sendKeys(text);
	}

   public void clickSearchBox()
   {		
	 this.driver.findElement(search_button).sendKeys(Keys.RETURN);
	}

}
