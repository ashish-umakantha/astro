package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OnBoarding {
	public OnBoarding(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
	@FindBy(id="com.astro.astroview:id/img_launcher_image_3")
	public MobileElement astrologo_launch;
	
	@FindBy(id="com.astro.astroview:id/tvCopyright")
	public MobileElement copy_right;
	
	@FindBy(id="com.astro.astroview:id/pbCurrentProgress")
	public MobileElement screen_1_loader;
		
	@FindBy(xpath = "//*[@text='The smart remote control at your fingertips']")
	public MobileElement screen_1_header_text;
	
	@FindBy(xpath = "//*[@text='Introducing the smart remote control that conveniently changes and controls your decoder right from the app.']")
	public MobileElement screen_1_content_text;
		
	@FindBy(id="com.astro.astroview:id/ibVolume")
	public MobileElement screen_1_volume;
	
	@FindBy(id="com.astro.astroview:id/ibRewind")
	public MobileElement screen_1_rewind;
	
	@FindBy(id="com.astro.astroview:id/ibPlay")
	public MobileElement screen_1_play;
	
	@FindBy(id="com.astro.astroview:id/ibPause")
	public MobileElement screen_1_pause;
	
	@FindBy(id="com.astro.astroview:id/ibStop")
	public MobileElement screen_1_stop;
	
	@FindBy(id="com.astro.astroview:id/ibFastForward")
	public MobileElement screen_1_forward;
	
	@FindBy(id="com.astro.astroview:id/ll_indicators")
	public MobileElement screen_indicators;
	
	@FindBy(id="com.astro.astroview:id/img_indicator_1")
	public MobileElement screen_indicator_1;
	
	@FindBy(id="com.astro.astroview:id/img_indicator_2")
	public MobileElement screen_indicator_2;
	
	@FindBy(id="com.astro.astroview:id/img_indicator_3")
	public MobileElement screen_indicator_3;
	
	@FindBy(id="com.astro.astroview:id/img_indicator_4")
	public MobileElement screen_indicator_4;
	
	@FindBy(className="android.widget.ImageView")
	public MobileElement screen_mobile_img;
	
	@FindBy(xpath = "//*[@text='Plan your TV schedule']")
	public MobileElement screen_2_header_text;
	
	@FindBy(xpath="//*[@text='With the 7-day TV guide at the palm of your hand, you won't miss the TV programmes you want to watch.']")
	public MobileElement screen_2_content_text;
	
	@FindBy(id="com.astro.astroview:id/img_discover_5")
	public MobileElement screen_3_img;
	
	@FindBy(xpath="//*[@text= 'Discover New & Engaging Content']")
	public MobileElement screen_3_header_text;
	
	@FindBy(name="Discover what's on anytime, anywhere. "
			+ "Have fun exploring Astro. There's always something for everyone.")
	public MobileElement screen_3_content_text;
	
	@FindBy(id="com.astro.astroview:id/img_remote_tv_border")
	public MobileElement screen_4_tv_img;
	
	@FindBy(id="com.astro.astroview:id/signal_line_3")
	public MobileElement screen_4_signal_line_3;
	
	@FindBy(id="com.astro.astroview:id/signal_line_2")
	public MobileElement screen_4_signal_line_2;
	
	@FindBy(id="com.astro.astroview:id/signal_line_1")
	public MobileElement screen_4_signal_line_1;
	
	@FindBy(id="ccom.astro.astroview:id/img_remote_mobile")
	public MobileElement screen_4_mob_img;
	
	@FindBy(id="com.astro.astroview:id/ll_image")
	public MobileElement screen_4_all_img;
	
	@FindBy(xpath="//*[@text= 'Never miss your favourite show again']")
	public MobileElement screen_4_header_text;
	
	@FindBy(xpath="//*[@text= 'You can easily record a show at your fingertip while you are away from your remote control.']")
	public MobileElement screen_4_content_text;
	
	@FindBy(className="android.widget.RelativeLayout")
	public MobileElement relative_view;
	
	@FindBy(className="android.widget.ProgressBar")
	public MobileElement loader;
		
}
