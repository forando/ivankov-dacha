package io.swagger.api.factories;

import io.swagger.api.ApiService;
import io.swagger.model.Pump;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class PumpApiServiceFactory {

   private static ApiService<Pump> service = null;

   public static ApiService<Pump> getPumpApi()
   {
      return service;
   }
   public static void setPumpApi(ApiService<Pump> _service)
   {
      service = _service;
   }
}
