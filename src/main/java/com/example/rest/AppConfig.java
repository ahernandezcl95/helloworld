package com.example.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api") // base URI for all resources
public class AppConfig extends Application {
    // No implementation needed unless you want to configure singletons or classes explicitly
}
