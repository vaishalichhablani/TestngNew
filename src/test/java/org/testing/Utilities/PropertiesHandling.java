package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandling {

    //@org.jetbrains.annotations.NotNull
    public  static Properties readProperties(String filepath) throws IOException {
        File f = new File(filepath);
        FileReader fr = new FileReader(f);
        Properties pr = new Properties();
        pr.load(fr);
        return pr;


    }
}
