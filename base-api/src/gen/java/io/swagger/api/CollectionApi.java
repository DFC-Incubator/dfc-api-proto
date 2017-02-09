package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CollectionApiService;
import io.swagger.api.factories.CollectionApiServiceFactory;

import io.swagger.model.CollectionInfo;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/collection")


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-09T20:10:39.884Z")
public class CollectionApi  {
   private final CollectionApiService delegate = CollectionApiServiceFactory.getCollectionApi();

    @GET
    @Path("/{absoluteLogicalPath}/info")
    
    @Produces({ "application/json", "application/xml" })
    public Response collectionInfo( @PathParam("absoluteLogicalPath") String absoluteLogicalPath, @QueryParam("brief") Boolean brief,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionInfo(absoluteLogicalPath,brief,securityContext);
    }
    @GET
    @Path("/{absoluteLogicalPath}")
    
    @Produces({ "application/json", "application/xml" })
    public Response collectionListing( @PathParam("absoluteLogicalPath") String absoluteLogicalPath,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.collectionListing(absoluteLogicalPath,securityContext);
    }
}
