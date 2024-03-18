package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStepdefs {
    HomePage homePage = new HomePage();

    @Then("user see notification pop up {string}")
    public void userSeeNotifPopUp(String textPopup) throws InterruptedException {
        homePage.userSeeNotifPopup(textPopup);

    }

    @And("user click OK button on notification")
    public void userClickOkButtonOnNotification() {
        homePage.userClickOkButtonOnNotification();
    }
}
