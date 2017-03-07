package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.BasementApiServiceFactory;
import io.swagger.model.Basement;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/basement")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the basement API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BasementApi  {
   private final ApiService<Basement> delegate = BasementApiServiceFactory.getBasementApi();

    @POST
    
    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "New Basement Object", notes = "Creates a new Basement object in the store.  Duplicates are allowed", response = Basement.class, tags={ "StoreBasementParams",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Server response", response = Basement.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Basement.class) })
    public Response addBasement(
        @ApiParam(value = "Basement object to add to the store." ,required=true) Basement basement,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addEntity(basement, Basement.class,securityContext);
    }

    @GET

    @io.swagger.annotations.ApiOperation(value = "Basement Params List", notes = "Provides a list of basement climate parameters.", response = Basement.class, responseContainer = "List", tags={ "ShowBasementParams" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of basement params temp, humidity.", response = Basement.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Basement.class, responseContainer = "List") })
    public Response basementGet(
        @ApiParam(value = "A date in miliseconds to fetch data from.",required=true) @QueryParam("start_date") Long startDate,
        @ApiParam(value = "A date in miliseconds to fetch data to.",required=true) @QueryParam("end_date") Long endDate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEntity(startDate,endDate, Basement.class,securityContext);
    }
}
