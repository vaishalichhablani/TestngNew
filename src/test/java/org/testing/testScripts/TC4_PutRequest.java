package org.testing.testScripts;

import io.restassured.response.Response;
import org.testing.Utilities.*;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TC4_PutRequest {
@Test
    public void testcase4() throws IOException {


        String requestbody = JSONHandling.readJSONFile("../FrameWork/src/test/java/org/testing/Resources/UpdateRequest.json");
        Properties pr1 = PropertiesHandling.readProperties("../FrameWork/Environment.properties");
        String idvalue = RandomData.generateRandomData();
        requestbody = JSONReplacement.Jsonhandling(requestbody, "id", idvalue);
        HttpMethods http = new HttpMethods(pr1);
        http.PutRequest(requestbody, "BATCH_URI",TC1_PostRequest.returnidvalue);

    }
}
