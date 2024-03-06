package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Objects;

import static helper.BaseTest.quitDriver;
import static helper.BaseTest.startDriver;

public class Hooks {

    String tagsRunning = null;

    @Before
    public void beforeTest(Scenario scenario) {

        String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
        tagsRunning = tags[0];
        if (Objects.equals(tagsRunning, "@web")) {
            startDriver();
        }
    }

    @After
    public void afterTest(Scenario scenario) throws InterruptedException {
        if (Objects.equals(tagsRunning, "@web")) {
            quitDriver();
        }
    }
}
