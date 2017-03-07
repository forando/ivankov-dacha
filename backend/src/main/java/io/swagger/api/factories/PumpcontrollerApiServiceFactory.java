package io.swagger.api.factories;

import io.swagger.api.PumpcontrollerApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class PumpcontrollerApiServiceFactory {

//   private final static PumpcontrollerApiService service = new PumpcontrollerApiServiceImpl();
   private static PumpcontrollerApiService service = null;

   public static PumpcontrollerApiService getPumpcontrollerApi()
   {
      return service;
   }
   public static void setPumpcontrollerApi(PumpcontrollerApiService _service)
   {
      service = _service;
   }
}
