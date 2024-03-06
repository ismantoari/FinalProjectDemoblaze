package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignupPage;


public class SignupStepdefs {
    SignupPage signup = new SignupPage();


    @Given("user is on sign up form")
    public void userIsOnSignupForm() {
        signup.userIsOnSignupForm();

    }


    @And("user input username {string}")
    public void userInputUsername(String userName) {
        signup.userInputUsername(userName);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        signup.userInputPassword(password);
    }

    @When("user click sign up button")
    public void userClickSignupButton() {
        signup.userClickSignupButton();
    }


}
