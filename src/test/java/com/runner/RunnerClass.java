package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reort;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Adactin.feature",glue="com.stepdef",dryRun=true,monochrome=true,plugin= {"json:target\\output.json"})
public class RunnerClass {
	
	@AfterClass
	public static void afterexecu() {
Reort report = new Reort();
report.jvmReport(System.getProperty("user.dir")+"\\target\\output.json");
	}
}
