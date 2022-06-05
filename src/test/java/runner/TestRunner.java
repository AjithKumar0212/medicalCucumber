package runner;

import org.Base.BaseClass;
import org.Base.reportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefintion"
,dryRun=false,strict=false,tags= {"@smoke,"},plugin= {"pretty",
		"html:target\\reports\\htmlReports\\htmlreport",
		"json:target\\reports\\jsonReports\\report.json",
		"junit:target\\reports\\junitReports\\junitReport.xml"
		},monochrome=true)
public class TestRunner extends BaseClass{
	@AfterClass
	public static void afterClass() {
		reportClass.generateJVMReport("target\\reports\\jsonReports\\report.json");
	browserQuit();
	}
}
