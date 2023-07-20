package org.testing.Utilities;

import io.restassured.response.Response;

public class ParsingJSONUsingJsonpath {

    public static String jsonparse(Response res3, String JsonPath)
    {
         String fetchvalue = res3.jsonPath().get(JsonPath);
         return fetchvalue;
    }
}
