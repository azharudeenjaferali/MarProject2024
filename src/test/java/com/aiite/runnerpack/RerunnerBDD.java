package com.aiite.runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Failed/rerun.txt",
				glue= {"com.aiite.pageexecution"},
				monochrome=true,
				dryRun = false,
				plugin = {"html:Reports/report1.html", "json:Reports/report2.json", "rerun:Failed/rerun.txt"})
public class RerunnerBDD {

}
