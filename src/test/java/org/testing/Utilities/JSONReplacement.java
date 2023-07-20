package org.testing.Utilities;

import java.util.regex.Pattern;

public class JSONReplacement {



    public static String Jsonhandling(String jsondata, String variablename, String variablevalue)
    {
        jsondata.replaceAll((Pattern.quote("{{"+variablename+"}}")),variablevalue);
        return jsondata;
    }
}
