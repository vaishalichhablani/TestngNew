package org.testing.testScripts;

import io.restassured.response.Response;
import org.testing.Utilities.ParsingJSONUSINGOrgJSON;
import org.testing.Utilities.PropertiesHandling;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TC2_GetAllRequest {
@Test
public  void testcase2() throws IOException {

    Properties pr2 = PropertiesHandling.readProperties("../FrameWork/Environment.properties");
    HttpMethods http = new HttpMethods(pr2);
    Response res1 = http.GetAllRequest("BATCH_URI");
    ParsingJSONUSINGOrgJSON.jsonparse(res1.asString(),"id");




}
}
