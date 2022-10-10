package stepdefs;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {

	int result = 0;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Calculator Opened");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
		// Write code here that turns the phrase above into concrete actions
		result = int1 + int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int int1) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(int1, result);
	}

	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> dataList) {

		for (int number : dataList) {
			result = result + number;
		}
	}

}
