package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	private WebDriver driver;
//	@Before
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver =  new ChromeDriver();
//
//	}
//	@After
//	public void tearDown() {
//		if(driver!=null) {
//			driver.quit();
//		}
//	}
//	LoginPage login = new LoginPage(driver);
//	HomePage home = new HomePage(driver);
//	@Given("User is on Login page")
//	public void user_is_on_login_page(String email, String Password) {
//		login.username("standard_user");
//		login.password("secret_sauce");
//
//	}
//
//	@Then("User needs to Login")
//	public void user_needs_to_login() {
//		login.submit();		    		}
//
//	@Given("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//		// Write code here that turns the phrase above into concrete actions
//		login.username("standard_user");
//		login.password("secret_sauce");
//	}
//
//	@When("user clicks on submit button")
//	public void user_clicks_on_submit_button() {
//		login.submit();
//	}
//
//	@Then("user logs into the homepage")
//	public void user_logs_into_the_homepage() {
//		home.showPage();
//	}

}


