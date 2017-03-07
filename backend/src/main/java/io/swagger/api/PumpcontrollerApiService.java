package io.swagger.api;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyRange;
import io.swagger.model.PumpController;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public abstract class PumpcontrollerApiService {

      public abstract Response pumpcontrollerGet(SecurityContext securityContext)
              throws NotFoundException;

      public abstract Response startPump(PumpController pumpController,SecurityContext securityContext)
              throws NotFoundException;
  
}
