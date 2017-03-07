package io.swagger.api.factories;

import io.swagger.api.ApiService;
import io.swagger.model.Indoor;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class IndoorApiServiceFactory {

   private static ApiService<Indoor> service = null;

   public static ApiService<Indoor> getIndoorApi()
   {
      return service;
   }
   public static void setIndoorApi(ApiService<Indoor> _service)
   {
      service = _service;
   }
}
