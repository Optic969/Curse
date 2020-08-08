import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        features = "src/test/features",
        glue = {"steps", "hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class PracticeTestCucumberRunner {

    @BeforeClass
    public static void setUp() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browserSize = "1680x1024";
        Configuration.browserCapabilities.setCapability("enableVNC",true);
    }

}




