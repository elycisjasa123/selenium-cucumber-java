package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features/"},
        glue = {"testDefinitionSample"},
        plugin = { "pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true
)

public class Runner {

}
