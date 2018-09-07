package Project.Sample;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class DefinitionGuru {
	public static WebDriver obj = null;
	String guru99 = "http://demo.guru99.com/V4/";
	
//	@BeforeMethod
//	public void setup() {
//		Date d = new Date();
//	    SimpleDateFormat form = new SimpleDateFormat("ddhhmmss");
//	    strTime = form.format(d);
//	    
//	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://demo.guru99.com/V4/");
//	}
//
//	@Test(priority = 0)
//	public void test_New_Customer_Can_Be_Created() {
//		objLogin = new Login(driver);
//		objNewCustomer = new NewCustomer(driver);
//
//		objLogin.loginToGuru("mgr123", "mgr!23");
//		objNewCustomer.clickNewCustomer();
//		objNewCustomer.createNewCustomer("abc", "20011998", "abc", "abc", "abc", "123456", "123456",
//				"vunguyen" + strTime + "@gmail.com", "123456");
//		customerID = objNewCustomer.getCustomerID();
//
//		Assert.assertTrue(objNewCustomer.getSuccessMessage().contains("Customer Registered Successfully!!!"));
//	}
//
//	@Test(priority = 1)
//	public void test_New_Account_Can_Be_Created_Based_On_New_Customer() {
//		objLogin = new Login(driver);
//		objNewCustomer = new NewCustomer(driver);
//		objNewAccount = new NewAccount(driver);
//
//		objLogin.loginToGuru("mngr146189", "hUtUbUp");
//		objNewAccount.clickNewAccount();
//		objNewAccount.createNewAccount(customerID, "30000");
//		accountID = objNewAccount.getAccountID();
//		org.junit.Assert.assertTrue(objNewAccount.getSuccessMessage().contains("Account Generated Successfully!!!"));
//	}
//
//	@org.junit.Test
//	public void test_Deposit_Work_Fine_With_New_Account() {
//		objLogin = new Login(driver);
//		objNewCustomer = new NewCustomer(driver);
//		objNewAccount = new NewAccount(driver);
//		objDeposit = new Deposit(driver);
//
//		objLogin.loginToGuru("mngr146189", "hUtUbUp");
//		objDeposit.clickDeposit();
//		objDeposit.createDeposit(accountID, "2000", "abc");
//		org.junit.Assert.assertTrue(
//				objNewAccount.getSuccessMessage().contains("Transaction details of Deposit for Account " + accountID));
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//	

	private ChromeOptions setOptionsForChrome() {
        String downloadFilepath = "D:\\04_Automation\\Eclipse\\Demo\\src\\test\\";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("disable-infobars");
        return options;
    }
	
	@Then("^I close the browser$")
	public void close_browser() {
		obj.quit();
	}
	
	@Given("^I navigate to the guru99$")
	public void iNavigateGuru99() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
        ChromeOptions options = setOptionsForChrome();
        obj = new ChromeDriver(options);
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		obj.get(guru99);
	}
	
	@And ("^I login to the Guru99$")
	public void iLoginGuru99() {
		Login objLogin = new Login(obj);
		objLogin.loginToGuru("mgr123", "mgr!23");
	}
}