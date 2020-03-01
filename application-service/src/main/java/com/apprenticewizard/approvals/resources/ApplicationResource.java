package com.apprenticewizard.approvals.resources;

import com.apprenticewizard.approvals.models.Application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Path("/applications")
@Produces(MediaType.APPLICATION_JSON)
public class ApplicationResource {

    @GET
    public Set<Application> getApplications() {
       return new HashSet<>(Arrays.asList(
               new Application("Fred", 600),
               new Application("Jane", 760),
               new Application("Jim", 450),
               new Application("Samantha", 850)
       ));
    }
}
