package org.testing.Utilities;

import com.fasterxml.jackson.databind.util.JSONPObject;
import groovy.json.JsonToken;
import  static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONHandling {
    public static String readJSONFile(String filepath) throws FileNotFoundException {
        File f = new File(filepath);
        FileReader fr = new FileReader(f);
        JSONTokener js = new JSONTokener(fr);
        JSONObject j = new JSONObject(js);
        return j.toString();
    }

}




