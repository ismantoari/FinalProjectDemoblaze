package page;

import org.openqa.selenium.By;
import static helper.BaseTest.driver;


import static helper.WebEndpoint.demoblaze;

public class SignupPage {
    By menuSignup = By.id("signin2");
    By inputUsername = By.id("sign-username");
    By inputPassword = By.id ("sign-password");

    By buttonSignup = By.xpath("//button[text()='Sign up']");

    public void userIsOnSignupForm(){
        driver.get(demoblaze);
        driver.findElement(menuSignup).click();
    }

    public void userInputUsername(String userName){
        driver.findElement(inputUsername).sendKeys(userName);
    }

    public void userInputPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void userClickSignupButton(){
        driver.findElement(buttonSignup).click();

    }

}
