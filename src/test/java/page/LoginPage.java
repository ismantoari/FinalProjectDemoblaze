package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.BaseTest.driver;
import static helper.WebEndpoint.demoblaze;

public class LoginPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By menuLogin = By.id("login2");
    By inputUsername = By.id("loginusername");
    By inputPassword = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");
    By textGreeting = By.id("nameofuser");


    public void userIsOnLoginPage(){
        driver.get(demoblaze);
        driver.findElement(menuLogin).click();
    }

    public void userInputLoginUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void userInputLoginPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void userClickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void userSeeLoginGreeting(String loginGreeting) throws InterruptedException {

        Thread.sleep(3000);

        wait.until(ExpectedConditions.presenceOfElementLocated(textGreeting));

        String actualLoginGreeting = driver.findElement(textGreeting).getText();
        System.out.println("greeting :" + actualLoginGreeting);
        Assert.assertEquals(loginGreeting,actualLoginGreeting);

        Thread.sleep(1000);
    }


}
