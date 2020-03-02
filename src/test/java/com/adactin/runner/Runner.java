package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.baseclass.BaseClass1;
import com.adactin.readers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition",
//plugin = "html:Report", 
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:Report/report.html" }
, dryRun = false, strict = true, monochrome = true)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		driver = BaseClass1.getDriver(FileReaderManager.getObject().ObjectCR().gerBrowserName());

	}
}
