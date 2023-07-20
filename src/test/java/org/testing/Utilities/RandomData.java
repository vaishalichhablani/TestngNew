package org.testing.Utilities;

import java.util.Random;

public class RandomData {

    public static String generateRandomData()
    {
        Random R = new Random();
        Integer idvalue = R.nextInt();
        return idvalue.toString();

    }
}
