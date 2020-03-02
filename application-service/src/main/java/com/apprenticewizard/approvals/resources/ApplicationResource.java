package com.apprenticewizard.approvals.resources;

import com.apprenticewizard.approvals.models.Application;
import com.apprenticewizard.approvals.services.ApplicationService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/applications")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApplicationResource {

    @Inject
    private ApplicationService applicationService;

    @GET
    public Collection<Application> getApplications() throws InterruptedException {
        Thread.sleep(800);
        return applicationService.findAll();
    }

    @POST
    public void create(Application application) throws InterruptedException {
        Thread.sleep(500);
        applicationService.create(application);
    }
}
