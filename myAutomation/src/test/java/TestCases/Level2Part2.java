package TestCases;

import org.testng.annotations.Test;

import CommonResources.Level2_methods;
import CommonResources.ReadPropertyFile;
import Locators.AstroHomePageObjects;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Level2Part2 {
  public WebDriver driver;
  public ReadPropertyFile data;
  public AstroHomePageObjects locators;
  public Level2_methods methods;

  @Test
  public void level2Part2() throws Exception 
  {	
	  methods = new Level2_methods();
	  methods.goToLastCampaign(driver);
  }
  @BeforeClass
  public void beforeClass() throws Exception {
	  driver = new ChromeDriver();
	  data = new ReadPropertyFile();
	  driver.navigate().to(data.getUrl());
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
