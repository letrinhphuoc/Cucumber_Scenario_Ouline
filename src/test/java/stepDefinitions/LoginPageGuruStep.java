package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageGuruStep {
	WebDriver driver;
	@Given("^I open live guru site$")
	public void iOpenLiveGuruSite()  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("http://live.guru99.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Given("^I open to my account page$")
	public void iOpenToMyAccountPage()  {
	    WebElement myAccountLink = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
	    myAccountLink.click();
	}

	@When("^I input username textbox is \"([^\"]*)\"$")
	public void iInputUsernameTextboxIs(String username)  {
		WebElement emailTextbox = driver.findElement(By.xpath("//input[@id='email']"));
		emailTextbox.sendKeys(username);
	    
	}

	@When("^I input password textbox is \"([^\"]*)\"$")
	public void iInputPasswordTextboxIs(String password)  {
		WebElement passTextbox = driver.findElement(By.xpath("//input[@id='pass']"));
		passTextbox.sendKeys(password);
	    
	}

	@When("^I click login button$")
	public void iClickLoginButton()  {
	   WebElement clickbutton = driver.findElement(By.xpath("//button[@id='send2']"));
	   clickbutton.click();
	}

	@Then("^I verify hompage is displayed$")
	public void iVerifyHompageIsDisplayed()  {
	    WebElement myDashboard = driver.findElement(By.xpath("//h1[text()='My Dashboard']"));
	    org.testng.Assert.assertTrue(myDashboard.isDisplayed());
	  
	   
	}
	@When("^I click to account link$")
	public void iClickToAccountLink()  {
	   WebElement accountLink = driver.findElement(By.xpath("//div[@class='page-header-container']//span[text()='Account']"));
	   accountLink.click();
	}
	@When("^I click to logout link$")
	public void iClickToLogoutLink()  {
	   WebElement clickLogout = driver.findElement(By.xpath("//a[@title='Log Out']"));
	   clickLogout.click();
	}
	@When("^I close browser$")
	public void iCloseBrowser()  {
	   driver.close();
	}
	


}
