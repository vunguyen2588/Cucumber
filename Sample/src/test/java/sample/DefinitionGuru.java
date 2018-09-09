package sample;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DefinitionGuru {
	public static WebDriver obj = null;
	public static String guru99 = "http://demo.guru99.com/V4/";
	public static String strTime;
	public static String customerID;
	public static String accountID;

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
	
	@And ("^I create a new customer$")
	public void iCreateNewCustomer() {
		Date d = new Date();
	    SimpleDateFormat form = new SimpleDateFormat("ddhhmmss");
	    strTime = form.format(d);
		NewCustomer objNewCustomer = new NewCustomer(obj);
		objNewCustomer.clickNewCustomer();
		objNewCustomer.createNewCustomer("abc", "20011998", "abc", "abc", "abc", "123456", "123456","vunguyen" + strTime + "@gmail.com", "123456");
		customerID = objNewCustomer.getCustomerID();
		Assert.assertTrue(objNewCustomer.getSuccessMessage().contains("Customer Registered Successfully!!!"));
	}
	
	@And ("^I create a new account$")
	public void iCreateNewAccount() {
		NewAccount objNewAccount = new NewAccount(obj);
		objNewAccount.clickNewAccount();
		objNewAccount.createNewAccount(customerID, "30000");
		accountID = objNewAccount.getAccountID();
		Assert.assertTrue(objNewAccount.getSuccessMessage().contains("Account Generated Successfully!!!"));
	}
	
	@And ("^I deposit to new account$")
	public void iDepositToNewAccount() {
		Deposit objDeposit = new Deposit(obj);
		objDeposit.clickDeposit();
		objDeposit.createDeposit(accountID, "2000", "abc");
		Assert.assertTrue(objDeposit.getSuccessMessage().contains("Transaction details of Deposit for Account " + accountID));
	}
	
	@Then("^I close the browser$")
	public void close_browser() {
		obj.quit();
	}
	
	@And("^I open application in (Chrome|Firefox|Safari) browser$")
	public void loginToSystem(String browser)  {
		if(browser.equalsIgnoreCase("Chrome")) {
	    	//	Code to launch Chrome
	    } else if(browser.equalsIgnoreCase("Firefox")) {
	    	//	Code to launch Firefox
	    } else if(browser.equalsIgnoreCase("Safari")) {
	    	// 	Code to launch Safari
	    }
	}
}