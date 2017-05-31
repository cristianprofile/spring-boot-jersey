package com.cassiomolin.example.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {


    @PostConstruct
    private void init() {
        packages("com.cassiomolin.example.api.resources");
    }
}