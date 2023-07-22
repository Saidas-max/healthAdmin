package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import static base_urls.MedunnaBaseUrl.medunnaSetUp;


public class Hook {
    @After
    public void tearDownScenario(Scenario scenario){
        // System.out.println("After Method");

        if (scenario.isFailed()){  // capture the screenshot when a scenario fails and attach it to the report

            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName()+"");
            Driver.closeDriver();
        }
    }


    @Before("@medunna_UserName_Email")
    public void beforeApi(){// this method will run before TC03_Api
        medunnaSetUp();
    }

}









