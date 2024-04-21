package com.aiite.pageexecution;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepDefinition {
	
	@Given("Launch the browser and load the amazon url")
	public void launch_the_browser_and_load_the_amazon_url() {
		BaseClass.browserLaunch();
		System.out.println("Browser Launched");
		BaseClass.loadUrl("https://www.amazon.in/");
		
	}

	@When("Provide the key on search box and click on search button")
	public void provide_the_key_on_search_box_and_click_on_search_button() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Mobile");
		hp.searchBtn.click();
		
	}

	@Then("validate if the results are for the Mobiles")
	public void validate_if_the_results_are_for_the_mobiles() {
	    //Validation for Mobile
		BaseClass.closeBrowser();
	}
	
	@When("Provide the key Laptop on search box and click on search button")
	public void provide_the_key_laptop_on_search_box_and_click_on_search_button() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Laptop");
		hp.searchBtn.click();
	}

	@Then("validate if the results are for the Laptops")
	public void validate_if_the_results_are_for_the_laptops() {
		//Validation for Laptops
		BaseClass.closeBrowser();
	}
	
	@Given("Login to the account")
	public void login_to_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select the samsung phone and add it to cart")
	public void select_the_samsung_phone_and_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Provide the payment detail on checkout page and submit order")
	public void provide_the_payment_detail_on_checkout_page_and_submit_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate if the order placed successfully")
	public void validate_if_the_order_placed_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
