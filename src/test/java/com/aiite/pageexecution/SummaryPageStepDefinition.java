package com.aiite.pageexecution;

import com.aiite.basepackage.BaseClass;

import io.cucumber.java.en.Given;

public class SummaryPageStepDefinition {
	
	@Given("Launch browser and load facebook url")
	public void launch_browser_and_load_facebook_url() throws InterruptedException {
		BaseClass.browserLaunch();		
		BaseClass.loadUrl("https://www.facebook.com/");
		System.out.println("Browser Launched");
		
	}

}
