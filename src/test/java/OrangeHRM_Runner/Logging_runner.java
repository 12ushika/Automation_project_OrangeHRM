package OrangeHRM_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "C:\\Users\\HP\\Desktop\\automation eclip\\OrangeHRM\\src\\main\\java\\LogingFunctinality_OrangeHRm.feature", 
                             "C:\\Users\\HP\\Desktop\\automation eclip\\OrangeHRM\\src\\main\\java\\EditLanguage_OrangeHRM.feature",
                             "C:\\Users\\HP\\Desktop\\automation eclip\\OrangeHRM\\src\\main\\java\\AddLanguage.feature"},
                  glue = "OrangeHRM.steps" , plugin= {"pretty", "html:target/cucumber-reports/report.html"} , monochrome=true)

public class Logging_runner extends AbstractTestNGCucumberTests 
{


}
