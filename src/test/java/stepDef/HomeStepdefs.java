package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("user is on home page")
    public void   userIsOnHomePage() {
        homePage.userIsOnHomePage();
    }

    @When("user look at the top left side of the homepage")
    public void userLookAtTheTopLeftSideOfTheHomepage() {
        homePage.userLookAtTheTopLeftSideOfTheHomepage();
    }

    @Then("user will see logo {string} and store name {string}")
    public void userWillSeeLogoAndStoreName(String logo, String storeName) {
        homePage.userWillSeeLogoAndStoreName(logo, storeName);
    }


//    @Then("Product only display phone product")
//    public void productOnlyDisplayPhoneProduct() throws InterruptedException {
//        homePage.assertionProductOnlyDisplayPhoneProduct();
//    }

    @When("user click categories {string}")
    public void userClickCategories(String categories) {
        homePage.userClickCategories(categories);
    }

    @Then("home page only display {string}")
    public void homePageOnlyDisplay (String productShow) throws InterruptedException {
        homePage.homePageOnlyDisplay(productShow);
    }
}
