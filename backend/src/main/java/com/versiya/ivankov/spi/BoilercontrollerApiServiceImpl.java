package com.versiya.ivankov.spi;

import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import io.swagger.api.BoilercontrollerApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.BoilerController;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import static com.versiya.ivankov.service.OfyService.ofy;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BoilercontrollerApiServiceImpl extends BoilercontrollerApiService {

    MemcacheService memcacheService = MemcacheServiceFactory.getMemcacheService();

    @Override
    public Response boilercontrollerGet(SecurityContext securityContext) throws NotFoundException {

        return Response.ok().entity(ensureIsValid()).build();
    }

    @Override
    public Response startBoiler(BoilerController boilerController, SecurityContext securityContext)
    throws NotFoundException {

        BoilerController singlton = ensureIsValid();
        singlton.setSetOn(boilerController.getSetOn());
        ofy().save().entity(singlton).now();

        return Response.ok().entity(singlton).build();
    }

    private BoilerController ensureIsValid(){

        BoilerController boilerController = getBoilerController();
        if (boilerController != null) return boilerController;

        System.out.println("CREAT NEW BoilerCobtroller Entity!!!");

        BoilerController bController = new BoilerController();
        ofy().save().entity(bController).now();

        return getBoilerController();
    }

    private BoilerController getBoilerController() {
        return ofy().load().type(BoilerController.class).id(1L).now();
    }

}
