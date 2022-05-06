package stepDefinition;
import static io.restassured.RestAssured.given;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class StepDefinition07{
Response response;



@Given("API for foreign exchange two")
public void api_for_foreign_exchange_two() {



RestAssured.baseURI = "https://reqres.in";


}



@When("posted with future date information")
public void posted_with_future_date_information() {



response = RestAssured.get("/api/2022-05-26");

Response response = given().log().all().header("Content-Type", "application/json").get("/api/2022-05-26").then()
.log().all().statusCode(200).extract().response();
}



@Then("validate positive response code received from futuredate")
public void validate_positive_response_code_received_from_futuredate() {



System.out.println(response.getStatusLine());
Assert.assertEquals(200, response.getStatusCode());
String date = response.header("Date");
System.out.println("Date value: " + date);
}



public static void main(String args[]) {

// Assert.assertEquals(400, response.getStatusCode());
// System.out.println("Status code is " + response.getStatusCode());
}
}