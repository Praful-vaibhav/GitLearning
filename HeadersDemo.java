package restassured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HeadersDemo {
	
    @Test
	void TestHeaders()
	{
		given()
		
		
		.when()
		.get("https://www.google.com")
		
		.then()
		.header("Content-Type", " text/html; charset=ISO-8859-1")
		.and()
		.header(" Content-Encoding", "gzip")
		.and()
		.header(" Server", " gws");
	}
	
}
