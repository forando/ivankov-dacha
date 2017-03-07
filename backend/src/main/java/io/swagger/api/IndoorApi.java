package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.IndoorApiServiceFactory;
import io.swagger.model.Indoor;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/indoor")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the indoor API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen",
        date = "2016-05-16T16:42:40.675Z")
public class IndoorApi  {
   private final ApiService<Indoor> delegate = IndoorApiServiceFactory.getIndoorApi();

    @POST

    @Consumes({"application/json"})
    @io.swagger.annotations.ApiOperation(
            value = "New Indoor Object", notes = "Creates a new Indoor object in the store.  Duplicates are allowed",
            response = Indoor.class, tags={ "StoreIndoorParams",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Server response", response = Indoor.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Indoor.class) })
    public Response addIndoor(
        @ApiParam(value = "Indoor object to add to the store." ,required=true) Indoor indoor,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addEntity(indoor, Indoor.class, securityContext);
    }


    @GET

    @io.swagger.annotations.ApiOperation(value = "Indoor Params List",
            notes = "Provides a list of indoor climate parameters.",
            response = Indoor.class, responseContainer = "List", tags={ "ShowIndoorParams" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of indoor params (temperature).",
                response = Indoor.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Indoor.class,
                responseContainer = "List") })
    public Response indoorGet(
        @ApiParam(value = "A date in miliseconds to fetch data from.",required=true) @QueryParam("start_date") Long startDate,
        @ApiParam(value = "A date in miliseconds to fetch data to.",required=true) @QueryParam("end_date") Long endDate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEntity(startDate,endDate, Indoor.class,securityContext);
    }
}
