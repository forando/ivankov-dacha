package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.PumpApiServiceFactory;
import io.swagger.model.Pump;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/pump")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the pump API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class PumpApi  {
   private final ApiService<Pump> delegate = PumpApiServiceFactory.getPumpApi();

    @GET

    @io.swagger.annotations.ApiOperation(value = "Pump State", notes = "Indicates wehter pump is on or off and provides remote controll.", response = Pump.class, responseContainer = "List", tags={ "ShowPumpState" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of pump states.", response = Pump.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Pump.class, responseContainer = "List") })
    public Response pumpGet(
        @ApiParam(value = "A date in miliseconds to fetch data from.",required=true) @QueryParam("start_date") Long startDate,
        @ApiParam(value = "A date in miliseconds to fetch data to.",required=true) @QueryParam("end_date") Long endDate,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEntity(startDate,endDate, Pump.class, securityContext);
    }

    @POST

    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "New Pump Object", notes = "Creates a new Pump object in the store.  Duplicates are allowed", response = Pump.class, tags={ "StorePumpState",  })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A stored pump object.", response = Pump.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pump.class) })
    public Response addPump(
            @ApiParam(value = "Pump object to add to the store." ,required=true) Pump pump,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.addEntity(pump, Pump.class, securityContext);
    }
}
