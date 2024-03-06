package page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.BaseTest.driver;
public class HomePage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    public void userSeeNotifPopup(String textPopup) throws InterruptedException {

        Alert alert = driver.switchTo().alert();

        Thread.sleep(100);

        String actualTextPopup = alert.getText();
        System.out.println("actual notif : " + actualTextPopup);
        System.out.println("expected notif : " + textPopup);

        // Assert.assertEquals(textPopup,actualTextPopup);
    }


}
