package io.swagger.api.factories;

import io.swagger.api.CollectionApiService;
import io.swagger.api.impl.CollectionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-09T20:10:39.884Z")
public class CollectionApiServiceFactory {

   private final static CollectionApiService service = new CollectionApiServiceImpl();

   public static CollectionApiService getCollectionApi()
   {
      return service;
   }
}
