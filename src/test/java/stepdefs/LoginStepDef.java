package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions


		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_passowrd() {
		// Write code here that turns the phrase above into concrete actions

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_passowrd() {
		// Write code here that turns the phrase above into concrete actions

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	}

	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
	
	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String UserNameVal, String PwdVal) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PwdVal);
	}


}
