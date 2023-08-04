package org.testing.testScripts;

import org.testing.Utilities.XMLHandling;

import java.io.IOException;

public class TC7_XMLSupport {

    public static void main(String[] args) throws IOException {
        XMLHandling.readXMl("../FrameWork/testng.xml");
    }
}
