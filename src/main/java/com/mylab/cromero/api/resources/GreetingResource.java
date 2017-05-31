package com.cassiomolin.example.api.resources;

import com.cassiomolin.example.api.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/greetings")
public class GreetingResource {


    @Autowired
    private User user;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getGreeting() {

        String method = user.method();

        return Response.ok(method).build();
    }
}