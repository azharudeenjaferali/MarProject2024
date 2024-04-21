package com.aiite.pageexecution;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;
import com.aiite.pagefactory.RegistrationForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFormStepDefinition {

	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
//		BaseClass.browserLaunch();
//		System.out.println("Browser Launched");
//		BaseClass.loadUrl("https://demoqa.com/automation-practice-form");
	}
	
	@When("Provide the valid details of student")
	public void provide_the_valid_details_of_student(io.cucumber.datatable.DataTable dataTable) {
		
		
		//asList()
//		List<String> values = dataTable.asList();
//		System.out.println(values.get(2));
//		
//		for (String value : values) {
//			System.out.println(value);
//		}
		
		
		//asLists()
//		List<List<String>> records = dataTable.asLists();
//		List<String> record = records.get(2);		
//		System.out.println(record.get(0));
//		
//		for (List<String> employee : records) {
//			for (String value : employee) {
//				System.out.println(value);
//			}
//			
//		}
		
		//asMaps()
		List<Map<String, String>> details = dataTable.asMaps();
		
//		Map<String, String> map = details.get(0);
//		System.out.println(map.get("FirstName"));
//		System.out.println(map.get("Gender"));
//		System.out.println(map.get("Location"));
		
		for (Map<String, String> detail : details) {
			System.out.println(detail.values());
		
		}
		
		
		
//		RegistrationForm lp = new RegistrationForm();
//		lp.firstNameField.sendKeys(values.get(0));
//		lp.lastNameField.sendKeys(values.get(1));
//		lp.emailField.sendKeys(values.get(2));
//		lp.submitBtn.click();
	}

	@Then("Submit the request and validate if its registered successfully")
	public void submit_the_request_and_validate_if_its_registered_successfully() {
		// Validation for Registration
//		BaseClass.closeBrowser();
	}

}
