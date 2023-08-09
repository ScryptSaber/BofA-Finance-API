package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "stepDefs",
        tags = "@Payment_API_Test",
        dryRun = false
        // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
        // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar
)
public class CukesRunner {

    // @Payment_API_Test
}
