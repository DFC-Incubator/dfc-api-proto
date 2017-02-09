package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.CollectionInfo;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-09T20:10:39.884Z")
public abstract class CollectionApiService {
      public abstract Response collectionInfo(String absoluteLogicalPath,Boolean brief,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response collectionListing(String absoluteLogicalPath,SecurityContext securityContext)
      throws NotFoundException;
}
