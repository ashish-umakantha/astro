package Locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShowLocators {
	
	public ShowLocators(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	@FindBy(id="com.astro.astroview:id/tv_show_details_title")
	public MobileElement show_title;
	
	@FindBy(id="com.astro.astroview:id/tv_show_details_availability")
	public MobileElement show_availability;
	
	@FindBy(id="com.astro.astroview:id/action_search")
	public MobileElement search_icon;
	
	@FindBy(id="com.astro.astroview:id/img_expand_arrow")
	public MobileElement expand_btn;
	
	@FindBy(id="com.astro.astroview:id/tv_show_short_desc")
	public MobileElement short_content;
	
	@FindBy(id="com.astro.astroview:id/fl_overlay")
	public MobileElement show_img;
	
	@FindBy(id="com.astro.astroview:id/fab_more")
	public MobileElement fab_menu;
	
	@FindBy(id="com.astro.astroview:id/tv_show_long_desc")
	public MobileElement expanded_content;
	
	@FindBy(id="com.astro.astroview:id/img_close_action")
	public MobileElement fab_menu_close;
	
	@FindBy(id="com.astro.astroview:id/img_remote_booking_action")
	public MobileElement fab_menu_remote;
	
	@FindBy(id="com.astro.astroview:id/img_reminder_action")
	public MobileElement fab_menu_reminder;
	
	@FindBy(id="com.astro.astroview:id/img_favourite_action")
	public MobileElement fab_menu_fav;
		
	@FindBy(id="com.astro.astroview:id/img_share_action")
	public MobileElement fab_menu_share;
	
	@FindBy(id="android:id/title")
	public MobileElement dialog_title;
	
	@FindBy(id="android:id/message")
	public MobileElement dialog_msg;
	
	@FindBy(id="android:id/button1")
	public MobileElement dialog_ok;
	
}
