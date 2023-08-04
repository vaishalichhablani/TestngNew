package org.testing.Assertions;

public class Assertionn {

    public  static void assertionsforInteger(int expectedstatuscode, int actualstatuscode)
    {
        if( expectedstatuscode==actualstatuscode) {
            System.out.println("statuscode is matching");
        }
        else{
            System.out.println("statuscode not matching");
        }
    }

    public  static void assertionsforString(String expecteddata, String actualdata)
    {
        if( expecteddata.equals(actualdata)) {
            System.out.println("Data is matching");
        }
        else{
            System.out.println("Data not matching");
        }
    }


}
