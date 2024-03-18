package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.userIsOnLoginPage();
    }

    @And("user input login username {string}")
    public void userInputLoginUsername(String username) {
        loginPage.userInputLoginUsername(username);
    }

    @And("user input login password {string}")
    public void userInputLoginPassword(String password) {
        loginPage.userInputLoginPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.userClickLoginButton();
    }

    @Then("user see login greeting {string}")
    public void userSeeLoginGreeting(String loginGreeting)  throws InterruptedException {
        loginPage.userSeeLoginGreeting(loginGreeting);
    }
}
