package io.swagger.api.factories;

import io.swagger.api.ApiService;
import io.swagger.model.Basement;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BasementApiServiceFactory {

    private static ApiService<Basement> service = null;

   public static ApiService<Basement> getBasementApi()
   {
      return service;
   }

    public static void setBasementApi(ApiService<Basement> _service)
    {
        service = _service;
    }
}
