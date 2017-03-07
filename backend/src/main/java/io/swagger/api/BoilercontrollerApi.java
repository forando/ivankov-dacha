package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.BoilercontrollerApiServiceFactory;
import io.swagger.model.BoilerController;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/boilercontroller")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the boilercontroller API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-18T10:47:23.821Z")
public class BoilercontrollerApi  {
    private final BoilercontrollerApiService delegate = BoilercontrollerApiServiceFactory.getBoilercontrollerApi();

    @GET

    @io.swagger.annotations.ApiOperation(value = "Show Boiler Controller State", notes = "Indicates wehter startBoiler command is set to TRUE or FALSE.", response = BoilerController.class, tags={ "ShowBoilerControllerState",  })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "An actual boiler controller object.", response = BoilerController.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BoilerController.class) })
    public Response boilercontrollerGet(
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.boilercontrollerGet(securityContext);
    }
    @POST

    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Set Boiler Controller", notes = "Sets boiler state (ON or OFF)", response = BoilerController.class, tags={ "SetBoilerControllerState" })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A newly reset boiler controller object.", response = BoilerController.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = BoilerController.class) })
    public Response startBoiler(
            @ApiParam(value = "BoilerController object to Start/Stop the boiler." ,required=true) BoilerController boilerController,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.startBoiler(boilerController,securityContext);
    }
}
