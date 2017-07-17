package CommonResources;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gargoylesoftware.htmlunit.WebClient;
import Locators.AstroHomePageObjects;

public class Level1_methods {
	
	public AstroHomePageObjects locators;
	public ReadPropertyFile data;
	public WebClient webclient;
	
	//Verifies if the page loads in 100 milli second and if not it captures the error and proceeds further.
	public void verifyPageInSeconds(WebDriver driver) throws Exception 
	  {
			data = new ReadPropertyFile();
			locators = new AstroHomePageObjects(driver);
		  	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);
		  	try{
		  		driver.navigate().to(data.getUrl());
		  	}catch(Exception e){}
		  	try{
		  		locators.home_astrologo.isDisplayed();
		  		locators.home_discover_tab.isDisplayed();
		  		locators.home_explore_tab.isDisplayed();
		  		locators.home_get_astro_tab.isDisplayed();
		  		locators.home_my_account_tab.isDisplayed();
		  		locators.home_support_tab.isDisplayed();
		  	}catch(Exception e){
		  		System.out.println("Did not load in 100 milliseconds " + e.getMessage());		
		  	}
		  	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  		driver.navigate().to(data.getUrl());
	  }
	
	//Verify page loads in 5 seconds, here i am using explict wait with timeout set for 5 seconds.
	public void verifyPageLoad(WebDriver driver) throws Exception
	  {
		  	data = new ReadPropertyFile();
		  	locators = new AstroHomePageObjects(driver);
		  	driver.navigate().to(data.getUrl());
			WebDriverWait wait=new WebDriverWait(driver,5);
				
			wait.until(ExpectedConditions.visibilityOf(locators.home_astrologo));
			wait.until(ExpectedConditions.visibilityOf(locators.home_discover_tab));
			wait.until(ExpectedConditions.visibilityOf(locators.home_explore_tab));
			wait.until(ExpectedConditions.visibilityOf(locators.home_get_astro_tab));
			wait.until(ExpectedConditions.visibilityOf(locators.home_my_account_tab));
			wait.until(ExpectedConditions.visibilityOf(locators.register_btn));
			wait.until(ExpectedConditions.visibilityOf(locators.login_btn));
	  }
	
	//Assert if the page as loaded completely i am using some of the footer text for reference.
	public void verifyPageLoadsCompletely(WebDriver driver) throws Exception
	{
		data = new ReadPropertyFile();
		locators = new AstroHomePageObjects(driver);
		locators.home_astrologo.isDisplayed();
		locators.home_discover_tab.isDisplayed();
		locators.home_explore_tab.isDisplayed();
		locators.home_get_astro_tab.isDisplayed();
		locators.home_my_account_tab.isDisplayed();
		locators.home_support_tab.isDisplayed();
  		driver.getPageSource().contains("Need assistance?");
  		driver.getPageSource().contains("Careers @ Astro");
  		driver.getPageSource().contains("General Terms & Conditions");
  		driver.getPageSource().contains("Copyright © 2017. Measat Broadcast Network Systems Sdn Bhd (240064-A). All Rights Reserved.");
	  	
	}
	
	//Method verifies all the links in the page and then iterate each link and check for status code. 
	public void verifyLinks(WebDriver driver)
	  {
		int counter = 0;
	    ArrayList<WebElement> element_list=new ArrayList<WebElement>();
	    element_list.addAll(driver.findElements(By.tagName("a")));
		System.out.println("Number of links are " + element_list.size());
		for (WebElement element : element_list)
		{
			String url = element.getAttribute("href");
			//condition for checking if the url is not null and url does not contain any javascript. 
			if (url !=null && (!(url.contains("javascript"))))
			{
				try 
				{
					webclient = new WebClient();
					//using webclient for getting the status code.
					int code = webclient.getPage(url).getWebResponse().getStatusCode();
					if (code != 200)
					{
						counter ++;
					}
				}catch(Exception e){}
			}
		}
		System.out.println("Total number of broken links are " + counter);
	  }
}


