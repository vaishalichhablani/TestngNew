package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJSONUSINGOrgJSON {

    public static void jsonparse(String responsedata, String fetchvariable)
    {
        JSONArray array = new JSONArray(responsedata);
        Integer L = array.length();
         for (int i=0;i<L;i++)
         {
             JSONObject ob = array.getJSONObject(i);
             System.out.println(ob.get(fetchvariable));
        }
    }
}
