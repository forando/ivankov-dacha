package io.swagger.api.factories;

import io.swagger.api.ApiService;
import io.swagger.model.Outdoor;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class OutdoorApiServiceFactory {

   private static ApiService<Outdoor> service = null;

   public static ApiService<Outdoor> getOutdoorApi()
   {
      return service;
   }
   public static void setOutdoorApi(ApiService<Outdoor> _service)
   {
      service = _service;
   }
}
