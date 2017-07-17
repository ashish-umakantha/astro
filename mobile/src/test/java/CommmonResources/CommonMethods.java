package CommmonResources;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.OnBoarding;
import Locators.loginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

public class CommonMethods {
	public ReadConfigFile data;
	public WebDriverWait wait;
	public loginPage LogLocators;
	public OnBoarding OnOboardLocators;
	
	//Method for login.
	public void login(AppiumDriver<MobileElement> driver) throws Exception
	   {
		   LogLocators = new loginPage(driver);
		   data = new ReadConfigFile();
		   wait=new WebDriverWait(driver,10);
		   LogLocators.astrologo_login_logo.isDisplayed();
		   LogLocators.astrologo_login_btn.isDisplayed();
		   LogLocators.astrologo_login_text.isDisplayed();
		   LogLocators.astrologo_sign_up_btn.isDisplayed();
		   LogLocators.astrologo_skip_btn.isDisplayed();
		   LogLocators.astrologo_login_btn.click();
		   wait.until(ExpectedConditions.visibilityOf(LogLocators.login_field));
		   LogLocators.login_field.isDisplayed();
		   LogLocators.login_field.sendKeys(data.getLogin());
		   driver.hideKeyboard();
		   LogLocators.password_field.sendKeys(data.getPassword());
		   driver.hideKeyboard();
		   LogLocators.web_view_login_btn.click();
		   
		   //Using try catch because agreement page takes longer time to load in 2g network.
		   try{
			   wait.until(ExpectedConditions.visibilityOf(LogLocators.agree_btn));
		   }catch(Exception e){}
		   
		   //Condition to check if agreement page is seen or home page is seen.
		   if (LogLocators.agree_btn.isDisplayed() == true)
		   {
			   System.out.println("Agreement page displayed");
			   LogLocators.disagree_btn.isDisplayed();
			   LogLocators.agree_btn.click();
		   }
		   
		   else
		   {
			   LogLocators.home_search_icon.isDisplayed();
		   }
		 
	   }
	//Method for skipping Onboarding screen
	public void SkipOnboarding(AppiumDriver<MobileElement> driver) throws InterruptedException
	   {
		   OnOboardLocators = new OnBoarding(driver);
		   OnOboardLocators.astrologo_launch.isDisplayed();
		   wait=new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.visibilityOf(OnOboardLocators.loader));
		   wait.until(ExpectedConditions.visibilityOf(OnOboardLocators.screen_1_volume));		   
		   OnOboardLocators.screen_1_volume.isDisplayed();
		   OnOboardLocators.screen_1_header_text.isDisplayed();
		   OnOboardLocators.screen_1_loader.isDisplayed();
		   OnOboardLocators.screen_1_content_text.isDisplayed();
		   OnOboardLocators.screen_1_rewind.isDisplayed();
		   OnOboardLocators.screen_1_play.isDisplayed();
		   OnOboardLocators.screen_1_pause.isDisplayed();
		   OnOboardLocators.screen_1_stop.isDisplayed();
		   OnOboardLocators.screen_1_forward.isDisplayed();
		   OnOboardLocators.screen_1_loader.isDisplayed();
		   OnOboardLocators.screen_indicator_1.isDisplayed();
		   OnOboardLocators.screen_indicator_2.isDisplayed();
		   OnOboardLocators.screen_indicator_2.isDisplayed();
		   OnOboardLocators.screen_indicator_3.isDisplayed();
		   OnOboardLocators.screen_indicator_4.isDisplayed();
		   OnOboardLocators.relative_view.swipe(SwipeElementDirection.LEFT,10,20,1000);
		   OnOboardLocators.screen_2_header_text.isDisplayed();
		   OnOboardLocators.relative_view.swipe(SwipeElementDirection.LEFT,10,20,1000);
		   OnOboardLocators.screen_3_img.isDisplayed();
		   OnOboardLocators.screen_3_header_text.isDisplayed();
		   OnOboardLocators.relative_view.swipe(SwipeElementDirection.LEFT,10,20,1000);
		   OnOboardLocators.screen_4_all_img.isDisplayed();
		   OnOboardLocators.screen_4_content_text.isDisplayed();
		   OnOboardLocators.screen_4_header_text.isDisplayed();
		   OnOboardLocators.screen_4_signal_line_1.isDisplayed();
		   OnOboardLocators.screen_4_signal_line_2.isDisplayed();
		   OnOboardLocators.screen_4_signal_line_3.isDisplayed();
		   OnOboardLocators.screen_4_tv_img.isDisplayed();
		   OnOboardLocators.relative_view.swipe(SwipeElementDirection.LEFT,10,20,1000);
	   
	   }
}
