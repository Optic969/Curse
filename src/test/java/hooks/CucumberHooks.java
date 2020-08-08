package hooks;
import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;

import java.io.File;
import java.io.IOException;

public class CucumberHooks {
    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            screenshot();

        }

    }

    @Attachment(type = "image/png")
    private byte[] screenshot() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile();
        return Files.toByteArray(screenshot);
    }
}
