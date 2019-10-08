package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\feature",
		glue="stepdefination",
		dryRun=true, strict=true,
		tags = {"@Sample", "~@Ignore"}
		)

public class Test_Runner extends BaseClass{
	
public static WebDriver driver;

@BeforeClass
public static void setup() throws Exception {

	driver = browserLaunch("chrome");
}

@AfterClass
public static void tearDown() {
driver.quit();
}
}
