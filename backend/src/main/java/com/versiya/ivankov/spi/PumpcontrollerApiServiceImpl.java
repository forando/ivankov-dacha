package com.versiya.ivankov.spi;

import io.swagger.api.NotFoundException;
import io.swagger.api.PumpcontrollerApiService;
import io.swagger.model.PumpController;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import static com.versiya.ivankov.service.OfyService.ofy;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class PumpcontrollerApiServiceImpl extends PumpcontrollerApiService {

    @Override
    public Response pumpcontrollerGet(SecurityContext securityContext) throws NotFoundException {

        return Response.ok().entity(ensureIsValid()).build();
    }

    @Override
    public Response startPump(PumpController pumpController, SecurityContext securityContext)
    throws NotFoundException {

        PumpController singleton = ensureIsValid();
        singleton.setSetOn(pumpController.getSetOn());
        ofy().save().entity(singleton).now();

        return Response.ok().entity(singleton).build();
    }

    private PumpController ensureIsValid(){

        PumpController pumpController = getPumpController();
        if (pumpController != null) return pumpController;

        System.out.println("CREAT NEW PumpCobtroller Entity!!!");

        pumpController = new PumpController();
        ofy().save().entity(pumpController).now();

        return getPumpController();
    }

    private PumpController getPumpController() {
        return ofy().load().type(PumpController.class).id(1L).now();
    }
    
}
