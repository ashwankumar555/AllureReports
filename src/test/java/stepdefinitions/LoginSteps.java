package stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_on_login_page() {
        System.out.println("Navigating to login page");
    }

    @When("user enters valid credentials")
    public void user_enters_credentials() {
        System.out.println("Entering credentials");
    }

    @Then("user is logged in successfully")
    public void user_logged_in() {
        System.out.println("Login successful");
    }
}
