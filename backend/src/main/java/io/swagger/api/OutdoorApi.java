package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.OutdoorApiServiceFactory;
import io.swagger.model.Outdoor;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/outdoor")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the outdoor API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class OutdoorApi  {
   private final ApiService<Outdoor> delegate = OutdoorApiServiceFactory.getOutdoorApi();

    @POST

    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "New Outdoor Object", notes = "Creates a new Outdoor object in the store.  Duplicates are allowed", response = Outdoor.class, tags={ "StoreOutdoorParams",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Server response", response = Outdoor.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Outdoor.class) })
    public Response addOutdoor(
        @ApiParam(value = "Outdoor object to add to the store." ,required=true) Outdoor outdoor,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addEntity(outdoor, Outdoor.class, securityContext);
    }

    @GET

    @io.swagger.annotations.ApiOperation(value = "Outdoor Params List", notes = "Provides a list of outdoor climate parameters.", response = Outdoor.class, responseContainer = "List", tags={ "ShowOutdoorParams" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of outdoor params temp, humidity, preassure, wind speed, light, rain.", response = Outdoor.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Outdoor.class, responseContainer = "List") })
    public Response outdoorGet(
        @ApiParam(value = "A date in miliseconds to fetch data from.",required=true) @QueryParam("start_date") Long startDate,
        @ApiParam(value = "A date in miliseconds to fetch data to.",required=true) @QueryParam("end_date") Long endDate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEntity(startDate,endDate, Outdoor.class,securityContext);
    }
}
