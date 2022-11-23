package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before
	public void before() {
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");

	}

	@After
	public void after(Scenario s) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "image/png");
		

	}
}
