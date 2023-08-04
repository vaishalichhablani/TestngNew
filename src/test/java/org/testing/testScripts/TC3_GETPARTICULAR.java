package org.testing.testScripts;

import io.restassured.response.Response;
import org.testing.ResponseValidations.responseValidations;
import org.testing.Utilities.PropertiesHandling;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TC3_GETPARTICULAR {
@Test
    public void testcase3() throws IOException {

        Properties pr2 = PropertiesHandling.readProperties("../FrameWork/Environment.properties");
        HttpMethods http = new HttpMethods(pr2);
        Response res1 = http.GetPARTICULARRequest("BATCH_URI", TC1_PostRequest.returnidvalue);
    responseValidations.responseValidationStatusCode(200,res1);
    responseValidations.responseValidationData("vaishali",res1,"firstname");
    }
}
