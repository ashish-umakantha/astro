package TestCases;

import org.testng.annotations.Test;
import CommonResources.Level2_methods;
import CommonResources.ReadPropertyFile;
import Locators.AstroHomePageObjects;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class level2 {
  
public WebDriver driver;
public AstroHomePageObjects home_obj;
public ReadPropertyFile data;
public Level2_methods level2;

@Test(priority=0)
  public void level2Case1() throws Exception {
	level2 = new Level2_methods();
	level2.determineCampaign(driver);
  }

@Test(priority=1)
public void level2Case2() throws Exception
{
	level2 = new Level2_methods();
	level2.verifyPostion(driver);
}

@BeforeClass
	public void beforeClass() throws Exception
	{	
		data = new ReadPropertyFile();
		driver=new ChromeDriver();
		driver.navigate().to(data.getUrl());
	}

@AfterClass
  public void afterClass() {
	driver.close();
	
  }

}
