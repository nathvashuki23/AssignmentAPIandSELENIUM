package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefinition {
	String uri = "https://reqres.in/api/users?page=2";
	Response response;

	
		@Given("API for Postman")
		public void api_for_postman() {
			RestAssured.baseURI=uri;
		 
		}

		@When("posted with correct Information")
		public void posted_with_correct_information() {
			response=RestAssured.get("https://reqres.in/api/users?page=2");
		    
		}

		@Then("validate response and log it on console")
		public void validate_response_and_log_it_on_console() {
			response = RestAssured.given()
					.headers("Content-type","application/json")
					.log().all()
					.get("https://reqres.in/api/users?page=2")
					.then()
					.assertThat()
					.statusCode(200)
					.log().all() //logging console
					.extract().response();
		  
		}

	

}
