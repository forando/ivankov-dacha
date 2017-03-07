package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.BoilerApiServiceFactory;
import io.swagger.model.Boiler;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/boiler")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the boiler API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BoilerApi  {
   private final ApiService<Boiler> delegate = BoilerApiServiceFactory.getBoilerApi();

    @GET

    @io.swagger.annotations.ApiOperation(value = "Boiler State", notes = "Indicates wehter boiler is on or off and provides remote controll.", response = Boiler.class, responseContainer = "List", tags={ "ShowBoilerState" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of boiler states.", response = Boiler.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Boiler.class, responseContainer = "List") })
    public Response boilerGet(
        @ApiParam(value = "A date in miliseconds to fetch data from.",required=true) @QueryParam("start_date") Long startDate,
        @ApiParam(value = "A date in miliseconds to fetch data to.",required=true) @QueryParam("end_date") Long endDate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEntity(startDate,endDate, Boiler.class, securityContext);
    }

    @POST

    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "New Boiler Object", notes = "Creates a new Boiler object in the store.  Duplicates are allowed", response = Boiler.class, tags={ "StoreBoilerState",  })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A stored boiler object.", response = Boiler.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Boiler.class) })
    public Response addBoiler(
            @ApiParam(value = "Boiler object to add to the store." ,required=true) Boiler boiler,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addEntity(boiler, Boiler.class, securityContext);
    }
}
