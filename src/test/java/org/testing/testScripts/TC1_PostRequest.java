package org.testing.testScripts;

import io.restassured.response.Response;
import org.testing.Utilities.*;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TC1_PostRequest {
    static String returnidvalue;
    @Test
    public  void testcase1() throws IOException {

         String requestbody = JSONHandling.readJSONFile("../FrameWork/src/test/java/org/testing/Resources/InputRequest.json");
        Properties pr1 = PropertiesHandling.readProperties("../FrameWork/Environment.properties");
        String idvalue = RandomData.generateRandomData();
        requestbody = JSONReplacement.Jsonhandling(requestbody, "id", idvalue);
        HttpMethods http = new HttpMethods(pr1);
         Response res = http.POSTRequest(requestbody, "BATCH_URI");
        returnidvalue = ParsingJSONUsingJsonpath.jsonparse(res,"id");
        System.out.println( "value of the id is :"+returnidvalue);


    }
}
