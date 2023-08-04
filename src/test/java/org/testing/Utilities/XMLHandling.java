package org.testing.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XMLHandling {

    public static String readXMl(String filepath) throws IOException {
        File f = new File(filepath);
        FileReader fr = new FileReader(f);
        BufferedReader Br = new BufferedReader(fr);
        String data = "";
        String line;
        while ( (line= Br.readLine())!= null)
        {
             data = data + line;
            System.out.println(data);

        }
        return data;
    }
}
