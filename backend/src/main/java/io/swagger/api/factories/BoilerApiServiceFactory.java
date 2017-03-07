package io.swagger.api.factories;

import io.swagger.api.ApiService;
import io.swagger.model.Boiler;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BoilerApiServiceFactory {

   private static ApiService<Boiler> service = null;

   public static ApiService<Boiler> getBoilerApi()
   {
      return service;
   }
   public static void setBoilerApi(ApiService<Boiler> _service)
   {
      service = _service;
   }
}
