package org.testing.ResponseValidations;

import io.restassured.response.Response;

import org.testing.Assertions.Assertionn;
import org.testing.Utilities.ParsingJSONUsingJsonpath;
import org.testng.Assert;

public class responseValidations {

    public static void responseValidationStatusCode(int expectedStatusCode, Response res)
    {
        Assertionn.assertionsforInteger(expectedStatusCode,res.statusCode());
        //Assert.assertEquals(res.statusCode(),expectedStatusCode,"status code not matching");
        //System.out.println("status code is matching");
    }
    public static void responseValidationData( String expectedData, Response res, String JSONPath)
    {
             String actualData = ParsingJSONUsingJsonpath.jsonparse(res,JSONPath);
             Assertionn.assertionsforString(expectedData, actualData);
             //Assert.assertEquals("actualData", "expectedData","date not matching");
        //System.out.println("actualData and expectedData is matching");
    }
}
