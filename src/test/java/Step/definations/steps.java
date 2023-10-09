package Step.definations;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Pagesnew.Homepage;
import Pagesnew.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utlities.Browserutilties;

public class steps {
	RemoteWebDriver driver;
	
	@Given("user open the browser")
	public void user_open_the_browser() {
	   driver=Browserutilties.getdriver();
	}

	@When("user navigates to the login URL")
	public void user_navigates_to_the_login_url() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user inputs valid {string} and {string}")
	public void user_inputs_valid_and(String username, String password) {
	    Loginpage loginpage=new Loginpage(driver);
	    loginpage.login(username, password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    Loginpage loginpage=new Loginpage(driver);
	    loginpage.clickOnLoginButton();
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
	   Homepage homepage=new Homepage(driver);
	   boolean flag= homepage.isProfileIconDisplyed();
	   Assert.assertEquals(flag, true);
	}
	@When("user inputs invalid {string} and {string}")
	public void user_inputs_invalid_and(String username, String password) {
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.login(username, password);
	}
	
	@Then("the login page is displayed with error message")
	public void the_login_page_is_displayed_with_error_message() {
	   Loginpage loginpage=new Loginpage(driver);
	   boolean flag= loginpage.isLoginErrorMessageDisplayed();
	   Assert.assertEquals(flag, true);
	}
	
	
}
