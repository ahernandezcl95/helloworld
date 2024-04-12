package com.example.rest;

import com.example.rest.domain.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.APPLICATION_JSON) // Producing JSON
    public Greeting getHello() {
        return new Greeting("Hello, World!");
    }
}
