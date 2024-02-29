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
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();

	}
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	@Given("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
login.username("standard_user");
login.password("secret_sauce");
}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
login.submit()	;}

	@Then("user logs into the homepage")
	public void user_logs_into_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user fails to log into the homepage with error message")
	public void user_fails_to_log_into_the_homepage_with_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}


