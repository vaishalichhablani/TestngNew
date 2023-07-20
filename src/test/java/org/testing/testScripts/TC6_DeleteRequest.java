package org.testing.testScripts;

import org.testing.Utilities.PropertiesHandling;
import org.testing.testSteps.HttpMethods;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TC6_DeleteRequest {
@Test
    public void testcase6() throws IOException {

         Properties pr1= PropertiesHandling.readProperties("../FrameWork/Environment.properties");
        HttpMethods http = new HttpMethods(pr1);
         http.DeleteRequest("BATCH_URI",TC1_PostRequest.returnidvalue);
    }
}
