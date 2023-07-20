package org.testing.trigger;

import org.testing.testScripts.*;

import java.io.IOException;

public class Trigger {

    public static void main(String[] args) throws IOException {
        System.out.println("*******TC1*******");
        TC1_PostRequest tc1 = new TC1_PostRequest();
        tc1.testcase1();
        System.out.println("*******TC2*******");
        TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
        tc2.testcase2();
        System.out.println("*******TC3*******");
        TC3_GETPARTICULAR tc3 = new TC3_GETPARTICULAR();
        tc3.testcase3();
        System.out.println("*******TC4*******");
        TC4_PutRequest tc4 = new TC4_PutRequest();
        tc4.testcase4();
        System.out.println("*******TC5*******");
        TC5_PatchRequest tc5 = new TC5_PatchRequest();
        tc5.testcase5();
        System.out.println("*******TC5*******");
        TC6_DeleteRequest tc6 = new TC6_DeleteRequest();
        tc6.testcase6();
    }
}
