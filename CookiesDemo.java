package restassured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class CookiesDemo {
	
	@Test
	void testCookies()
	{
		given()
		
		.when()
		.get("https://www.youtube.com/watch?v=kxPC6wEbbaU")
		
		.then()
		.cookie("YSC","bQr6u2oflMO")
		.log().all();
	}
	
	}


