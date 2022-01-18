import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        plugin = {"pretty", "html:target/reports.html"},
        tags = "@first"
)

public class Runner {

}

