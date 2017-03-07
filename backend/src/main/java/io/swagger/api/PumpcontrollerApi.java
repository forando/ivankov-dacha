package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.PumpcontrollerApiServiceFactory;
import io.swagger.model.PumpController;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/pumpcontroller")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the pumpcontroller API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-18T10:47:23.821Z")
public class PumpcontrollerApi  {
    private final PumpcontrollerApiService delegate = PumpcontrollerApiServiceFactory.getPumpcontrollerApi();

    @GET

    @io.swagger.annotations.ApiOperation(value = "Show Pump Controller State", notes = "Indicates wehter startPump command is set to TRUE or FALSE.", response = PumpController.class, tags={ "ShowPumpControllerState",  })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "An actual pump controller object.", response = PumpController.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PumpController.class) })
    public Response pumpcontrollerGet(
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.pumpcontrollerGet(securityContext);
    }
    @POST

    @Consumes({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Pump Controller State", notes = "Sets pump state (ON or OFF)", response = PumpController.class, tags={ "SetPumpControllerState" })
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A newly reset pump controller object.", response = PumpController.class),
            @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = PumpController.class) })
    public Response startPump(
            @ApiParam(value = "PumpController object to Start/Stop the pump." ,required=true) PumpController pumpController,
            @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.startPump(pumpController,securityContext);
    }
}
