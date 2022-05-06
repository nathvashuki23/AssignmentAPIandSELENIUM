package stepDefinition;



import org.testng.Assert;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class StepDefinition05 {



Response response;



@Given("API for negative scenario one")
public void api_for_negative_scenario_one() {

RestAssured.baseURI="https://reqres.in";
}





@When("posted with incorrect Information")
public void posted_with_incorrect_information() {

response= RestAssured.get("/api/users/23");
Response response =
RestAssured.given().log().all()
.header("Content-Type", "application/json")
.when().get("https://reqres.in/api/users/23")
.then().log().all().statusCode(404).extract().response();

}





@Then("validate negative response code received")
public void validate_negative_response_code_received() {

System.out.println(response.getStatusLine());
//Assert.assertEquals(404,response.getStatusCode());
}
//public static void main(String args[]) {

// Assert.assertEquals(404,response.getStatusCode());
// System.out.println("Status code is "+ response.getStatusCode());
}