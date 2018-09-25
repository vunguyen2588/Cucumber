package Demo;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStepDefinition {

	public static WebDriver obj = null;
	public static String guru99 = "http://demo.guru99.com/V4/";
	
	@Given("^I navigate to the guru99$")
	public void iNavigateGuru99() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		obj.get(guru99);
	}
	
	@And ("^I input the right user$")
	public void inputRightUsername() {
		obj.findElement(By.name("uid")).sendKeys("mgr123");
	}
	
	@And ("^I input the right password$")
	public void inputRightPassword() {
		obj.findElement(By.name("password")).sendKeys("mgr!23");
	}
	
	@And ("^I click login button$")
	public void clickLoginButton() {
		obj.findElement(By.name("btnLogin")).click();
	}
	
	@Then ("^I verify login successfylly$")
	public void verifyLoginSuccessfully() {
		Assert.assertEquals("Login successfully", "Welcome To Manager's Page of Guru99 Bank", obj.findElement(By.cssSelector(".heading3")).getText());
	}
}