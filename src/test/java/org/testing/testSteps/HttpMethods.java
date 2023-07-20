package org.testing.testSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.Properties;

import static io.restassured.RestAssured.given;

public class HttpMethods {

    Properties pr;


    public HttpMethods(Properties pr) {
        this.pr = pr;
    }

    public Response POSTRequest(String requestbody, String urikeyname) {
        String urivalue = pr.getProperty(urikeyname);
        Response res =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestbody)
                        .when()
                        .post(urivalue);
        //return ;

        System.out.println(" POST Request/RESPONSE STATUS CODE IS :" + res.statusCode());
        System.out.println(" POST Request/Response is :" + res.asString());
        return res;
    }

    public Response GetAllRequest(String urikeyname) {
        String urivalue = pr.getProperty(urikeyname);
        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .get(urivalue);


        System.out.println(" GET Request/RESPONSE STATUS CODE IS :" + res.statusCode());
        System.out.println("GET Request Response is :" + res.asString());

        return res;
    }

    public Response GetPARTICULARRequest(String urikeyname, String endpoint) {
        String urivalue = pr.getProperty(urikeyname) + "/" + endpoint;
        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .get(urivalue);


        System.out.println(" GET Request/RESPONSE STATUS CODE IS :" + res.statusCode());
        System.out.println("GET Request Response is :" + res.asString());

        return res;
    }
        public Response PutRequest(String requestbody, String urikeyname, String endpoint) {
            String urivalue = pr.getProperty(urikeyname)+ "/" +endpoint;
            Response res =
                    given()
                            .contentType(ContentType.JSON)
                            .body(requestbody)
                            .when()
                            .put(urivalue);
            //return ;

            System.out.println(" PUT Request/RESPONSE STATUS CODE IS :" + res.statusCode());
            System.out.println(" PUT Request/Response is :" + res.asString());
            return res;

    }

    public Response PatchRequest(String requestbody,String urikeyname, String endpoint)
    {

     String urivalue = pr.getProperty(urikeyname) + "/" + endpoint;

      Response res =  given()
             .contentType(ContentType.JSON)
             .body(requestbody)
             .when()
             .patch(urivalue);
        System.out.println(res.statusCode());
        System.out.println(res.asString());
        return res;
    }

    public void DeleteRequest(String urikeyname, String endpoint)

    {
         String urivalue = pr.getProperty(urikeyname) + "/" + endpoint;

          Response res = given()
                 .contentType(ContentType.JSON)
                 .when()
                 .delete(urivalue);
        System.out.println("delete request status code is " +res.statusCode());
        System.out.println(res.asString());

    }
}
