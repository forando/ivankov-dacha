package io.swagger.api;

import io.swagger.model.BoilerController;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public abstract class BoilercontrollerApiService {

      public abstract Response boilercontrollerGet(SecurityContext securityContext)
              throws NotFoundException;

      public abstract Response startBoiler(BoilerController boilerController,SecurityContext securityContext)
              throws NotFoundException;
  
}
