package com.bridge.serviceInterface;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;
import org.apache.log4j.Logger;


@Path("/test")
public interface TestService {

	    @GET
	    @Description(value = "resource", target = DocTarget.RESOURCE)
	    @Path("/collegelist")
	    @Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	    public String testService();
	     
	    //test URL on local machine would be something like this
	    //http://localhost:8080/bridgerest/services/rest/test/collegelist

}
