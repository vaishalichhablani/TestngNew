package org.testing.testScripts;

import org.testing.Utilities.JSONHandling;
import org.testing.Utilities.PropertiesHandling;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TC5_PatchRequest {
@Test
    public void testcase5() throws IOException {
         String requestbody = JSONHandling.readJSONFile("../FrameWork/src/test/java/org/testing/Resources/PatchRequest.json");
         Properties pr1= PropertiesHandling.readProperties("../FrameWork/Environment.properties");
        HttpMethods http = new HttpMethods(pr1);
        http.PatchRequest(requestbody,"BATCH_URI",TC1_PostRequest.returnidvalue);
    }
}
