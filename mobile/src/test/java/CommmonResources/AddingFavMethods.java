package CommmonResources;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.HomePage;
import Locators.ShowLocators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

public class AddingFavMethods {
	public HomePage HomeLocators;
	public ShowLocators ShowLocators;
	public WebDriverWait wait;
	
	public void ShowTestCase(AppiumDriver<MobileElement> driver) throws Exception
	   {
		   HomeLocators = new HomePage(driver);
		   ShowLocators = new ShowLocators(driver);
		   wait=new WebDriverWait(driver,15);
		   //Below are validating all ui - it covers ui cases as well.
		   HomeLocators.home_search_icon.isDisplayed();
		   HomeLocators.astro_toolbar_title.isDisplayed();
		   HomeLocators.hero_banner_img.isDisplayed();
		   HomeLocators.hero_banner_title.isDisplayed();
		   HomeLocators.hero_banner_date.isDisplayed();
		   //I am using wait.until for achieving explicit wait (15 sec) with as reminder and booking btn is not seen for all hero title. 
		   wait.until(ExpectedConditions.visibilityOf(HomeLocators.hero_reminder_btn));
		   wait.until(ExpectedConditions.visibilityOf(HomeLocators.remote_booking_btn));
		   HomeLocators.banner_content.isDisplayed();
		   HomeLocators.quick_link_discover_tab.isDisplayed();
		   HomeLocators.quick_link_channels_tab.isDisplayed();
		   HomeLocators.quick_link_tv_guide_tab.isDisplayed();
		   HomeLocators.quick_link_on_demand_tab.isDisplayed();
		   HomeLocators.quick_link_remote_control_tab.isDisplayed();
		   wait.until(ExpectedConditions.visibilityOf(HomeLocators.channel_show_img));
		   HomeLocators.banner_view.swipe(SwipeElementDirection.UP, 10, 10, 1000);
		   HomeLocators.frame_layout_view.isDisplayed();
		   HomeLocators.channel_show_img.isDisplayed();
		   HomeLocators.second_show.click();
		   wait.until(ExpectedConditions.visibilityOf(ShowLocators.show_img));
		   ShowLocators.show_title.isDisplayed();
		   ShowLocators.show_availability.isDisplayed();
		   ShowLocators.fab_menu.isDisplayed();
		   ShowLocators.expand_btn.isDisplayed();
		   ShowLocators.short_content.isDisplayed();
		   verifySynopsis(driver);
		   AddReminder(driver);
		   HomeLocators.second_show.click();
		   wait.until(ExpectedConditions.visibilityOf(ShowLocators.show_img));
		   AddFav(driver);
	   }
	
	// Method for Verifying Synopsis length is more than 50 characters.
	public void verifySynopsis(AppiumDriver<MobileElement> driver)
	{
		ShowLocators = new ShowLocators(driver);
		ShowLocators.expand_btn.click();
		ShowLocators.expanded_content.isDisplayed();
		String expanded = ShowLocators.expanded_content.getAttribute("text");
		int length = expanded.length();
		if (length <= 50){
			fail("Synopsis length is less than 50 charcters");
		}
	}
	
	//Method for adding reminder
	public void AddReminder(AppiumDriver<MobileElement> driver) throws InterruptedException
	{	
		wait=new WebDriverWait(driver,15);
		ShowLocators = new ShowLocators(driver);
		ShowLocators.fab_menu.isDisplayed();
		ShowLocators.fab_menu.click();
		ShowLocators.fab_menu_reminder.isDisplayed();
		ShowLocators.fab_menu_close.isDisplayed();
		ShowLocators.fab_menu_reminder.click();
		wait.until(ExpectedConditions.visibilityOf(ShowLocators.dialog_title));
		ShowLocators.dialog_msg.isDisplayed();
		ShowLocators.dialog_ok.isDisplayed();
		ShowLocators.dialog_ok.click();
		driver.navigate().back();
	}
	
	//Method for adding favorite
	public void AddFav(AppiumDriver<MobileElement> driver) throws Exception
	{
		wait=new WebDriverWait(driver,15);
		ShowLocators = new ShowLocators(driver);
		HomeLocators = new HomePage(driver);
		
		ShowLocators.fab_menu.isDisplayed();
		ShowLocators.fab_menu.click();
		String before_title = ShowLocators.show_title.getAttribute("text");
		ShowLocators.fab_menu_fav.isDisplayed();
		ShowLocators.fab_menu_fav.click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(HomeLocators.favorite_tab));
		HomeLocators.favorite_tab.click();
		String after_title = HomeLocators.show_title.getAttribute("text");
		assertEquals(after_title, before_title);
		HomeLocators.show_title.click();
		ShowLocators.fab_menu.isDisplayed();
		ShowLocators.fab_menu.click();
		ShowLocators.fab_menu_fav.isDisplayed();
		ShowLocators.fab_menu_fav.click();
		driver.navigate().back();
		if (HomeLocators.favorite_empty.isDisplayed())
		{
			System.out.println("No Favorite is seen");
		}
		
	}
	
}
