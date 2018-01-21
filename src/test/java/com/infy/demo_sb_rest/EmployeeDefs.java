package com.infy.demo_sb_rest;

import org.springframework.http.HttpStatus;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EmployeeDefs extends SpringIntegrationTest {
	
	@When("^Client call /customer$")
	public void client_call_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    executeGet("http://localhost:8080/customer");
		
	}

	@Then("^the employee get the status code of (\\d+)$")
	public void theStatus_code_employee_code(int statusCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    final HttpStatus currentStatusCode=latestResponse.getTheResponse().getStatusCode();
	   
	    assertThat("status code is incorrect :"+latestResponse.getBody(),currentStatusCode.value(),is(statusCode));
	}

	@Then("^the response should contain:$")
	public void the_employee_receive_server_version_body(String version) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(version);
	    System.out.println(latestResponse.getBody());
	    assertThat(latestResponse.getBody(),is(version));
	}
	
	

}
