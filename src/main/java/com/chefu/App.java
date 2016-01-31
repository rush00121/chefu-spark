package com.chefu;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

/**
 * Created by rushabh on 1/31/16.
 */
public class App {

    public static void main(String[] args) {
        get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!!";
            }
        });
    }
}
