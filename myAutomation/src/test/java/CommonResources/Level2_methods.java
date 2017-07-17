package CommonResources;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Locators.AstroHomePageObjects;

public class Level2_methods {
	public AstroHomePageObjects locators;
	public ReadPropertyFile data;
	
	//Method to determine the test campaign
	public void determineCampaign(WebDriver driver) throws Exception
	{
		locators = new AstroHomePageObjects(driver);
		ArrayList <WebElement> banner=new ArrayList<WebElement>();
		banner.addAll(driver.findElements(By.xpath(".//*[@id='highlights']/ol/li")));
		
	 //for finding the campaign's location
		
		for (int i=0;i<=banner.size();i++)
		{
			driver.findElement(By.xpath(".//*[@id='highlights']/ol/li"+"["+(i+1)+"]"+"/a")).click();
			if (locators.third_banner_content.isDisplayed())
			{
				System.out.println("The campaign is found at "+(i+1)+" postion" );
				break;
			}
		}
	}
	
	//Asserts if the test campaign is in third position.
	public void verifyPostion(WebDriver driver) throws Exception
	{
		locators = new AstroHomePageObjects(driver);
		locators.third_banner.click();
		boolean element = locators.third_banner_content.isDisplayed();
		Assert.assertTrue(element, "Element is not displayed at postion 3");
	}
	
	//Below method helps you to navigate to the last campaign, asserts if last campaign is same as test campaign.
	public void goToLastCampaign(WebDriver driver) throws Exception
	{
		locators = new AstroHomePageObjects(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		//Checks for how many hero banners using indicator xpath and accordingly goes to the last banner.
		
		ArrayList<WebElement> banner = new ArrayList<WebElement>();
		banner.addAll(driver.findElements(By.xpath(".//*[@id='highlights']/ol/li")));
		int lastpos = banner.size();
		
		//takes you to the last banner by clicking on the last indicator.
		
		driver.findElement(By.xpath(".//*[@id='highlights']/ol/li[" + lastpos + "]/a")).click();
		if (!(locators.third_banner_content.isDisplayed()))
		{	
			System.out.println("Not matching, hence moving to sign up");
			driver.findElement(By.xpath(".//*[@id='highlights']/div/ul/li[10]/a/div")).click();
			wait.until(ExpectedConditions.visibilityOf(locators.register_btn));
			signUp(driver);
		}
	}
	
	//Generic method for sign up.
	public void signUp(WebDriver driver) throws Exception
	{
		data = new ReadPropertyFile();
		locators = new AstroHomePageObjects(driver);
		
		locators.register_btn.isDisplayed();
		locators.register_btn.click();
		locators.first_name.isDisplayed();
		locators.last_name.isDisplayed();
		locators.email.isDisplayed();
		locators.confirm_email.isDisplayed();
		locators.password.isDisplayed();
		locators.submit.isDisplayed();
		locators.first_name.sendKeys(data.getFirstname());
		locators.last_name.sendKeys(data.getLastname());
		locators.email.sendKeys(data.getEmail());
		locators.confirm_email.sendKeys(data.getEmail());
		locators.password.sendKeys(data.getPassword());
		locators.submit.click();
		
	}
}
