package stepDef;

import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStepdefs {
    HomePage homePage = new HomePage();

    @Then("user see notification pop up {string}")
    public void userSeeNotifPopUp(String textPopup) throws InterruptedException {
        homePage.userSeeNotifPopup(textPopup);

    }
}
