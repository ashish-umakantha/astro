package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AstroHomePageObjects {
	
	// This constructor will initialize all my objects and it take driver type as parameter
		public AstroHomePageObjects(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		// Using annotations for defining locators
		@FindBy(xpath="//div[@class='astrologo']")
		public WebElement home_astrologo;
		
		@FindBy(id="whatson_but")
		public WebElement home_discover_tab;
		
		@FindBy(id="getastro_but")
		public WebElement home_get_astro_tab;
		
		@FindBy(id="support_but")
		public WebElement home_support_tab;
		
		@FindBy(id="myaccount_but")
		public WebElement home_my_account_tab;
		
		@FindBy(id="explore_but")
		public WebElement home_explore_tab;
		
		@FindBy(id="acmregister")
		public WebElement register_btn;
		
		@FindBy(id="acmlogin")
		public WebElement login_btn;
		
		@FindBy(className="slidecontent")
		public WebElement slide_content;
		
		@FindBy(xpath="//div[@class='textbox']/h2[contains(text(),'Winter is here')]")
		public WebElement third_banner_content;
		
		@FindBy(xpath=".//*[@id='highlights']/ol/li[3]/a")
		public WebElement third_banner;
		
		@FindBy(xpath="//div[@class='row']/div/input[@tabindex=1]")
		public WebElement first_name;
		
		@FindBy(xpath="//div[@class='row']/div/input[@tabindex=2]")
		public WebElement last_name;
		
		@FindBy(xpath=".//*[@id='divEmail']/input[1]")
		public WebElement email;
		
		@FindBy(xpath=".//*[@id='divEmail']/input[2]")
		public WebElement confirm_email;
		
		@FindBy(xpath=".//*[@id='password']")
		public WebElement password;
		
		@FindBy(xpath=".//*[@id='btnSubmit']")
		public WebElement submit;
		
}
