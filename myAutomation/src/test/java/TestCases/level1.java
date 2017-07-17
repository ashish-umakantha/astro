package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import CommonResources.Level1_methods;

public class level1 {
	
	public WebDriver driver;
	public Level1_methods methods;

@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
	}
	
@Test(priority=0)
	public void level1Cases1() throws Exception
  	{
		methods = new Level1_methods();
		
		methods.verifyPageInSeconds(driver);
  	}

@Test(priority=1)
  	public void level1Cases2() throws Exception
  	{
		driver = new ChromeDriver();
	  	methods = new Level1_methods();
	
	  	methods.verifyPageLoad(driver);
	  	methods.verifyPageLoadsCompletely(driver);
	  	methods.verifyLinks(driver);
	    
  	}

@AfterMethod
public void methodClose(){
	driver.close();
}
}