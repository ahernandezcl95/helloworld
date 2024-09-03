package com.example.rest;

import com.example.rest.domain.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

    private static final int BUFFER_SIZE = 1024 * 1024;

    @GET
    @Produces(MediaType.APPLICATION_JSON) // Producing JSON
    public Greeting getHello() {
        long loops = Math.round((float) Math.random() * 1_000_000_000);
        // Infinite loop that performs computations to burn CPU
        while (loops-- > 0) {
            byte[] buffer = new byte[BUFFER_SIZE];
            if(loops < buffer.length) {
                buffer = new byte[(int) loops];
            }

            buffer[0] = 1;

            double value = Math.random();

            // Perform some CPU-intensive computations
            for (int i = 0; i < 1_000_000; i++) {
                value = Math.sin(value) * Math.cos(value) * Math.tan(value);
            }
        }
        return new Greeting("Hello, Issue!");
    }
}
