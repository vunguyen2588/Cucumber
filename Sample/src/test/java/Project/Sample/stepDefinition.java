package Project.Sample;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class stepDefinition {
	
	public static WebDriver obj = null;
	String url = "https://batdongsan.com.vn/mua-can-ho-chung-cu-chung-cu-199-ho-tung-mau/can-mua-chung-cu-199-ho-tung-mau-can-67m2-lh-0986329050-ad73505";

	@Given("^url opened$")
	public void url_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = setOptionsForChrome();
        obj = new ChromeDriver(options);
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		obj.get(url);
	}

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
	
	@Then("^get title$")
	public void get_title() throws InterruptedException {
		System.out.println("Title: " + obj.findElement(By.xpath("//div[@class='pm-title']/h1")).getText());
	}

	@Then("^get khu vuc$")
	public void get_khu_vuc() {
		System.out.println("Khu vuc: " + obj.findElement(By.xpath("//span[@class='diadiem-title mar-right-15']")).getText());
	}

	@Then("^get gia$")
	public void get_gia() {
		System.out.println("Gia: " + obj.findElement(By.xpath("//span[@class='gia-title mar-right-15']/strong")).getText());
	}

	@Then("^get dien tich$")
	public void get_dien_tich() {
		System.out.println("Dien tich: " + obj.findElement(By.xpath("//span[@class='gia-title']/strong")).getText());
	}

	@Then("^get mo ta$")
	public void get_mo_ta() {
		System.out.println("Mo ta: " + obj.findElement(By.xpath("//div[@class='pm-content stat']")).getText());
	}

	@Then("^Close browser$")
	public void close_browser() {
		obj.quit();
	}
}