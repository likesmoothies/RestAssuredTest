package RestAssuredTest;

//import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;


public class Demo1_Get_Request {

	@Test
	public void getRespond(){
		given()
		.when()
			.get("https://dog.ceo/api/breeds/image/random")
		.then()
			.statusCode(400)
			.assertThat().body("status", equalTo("success") )
			.header("content-type","application/json");
	}
	
	
}
