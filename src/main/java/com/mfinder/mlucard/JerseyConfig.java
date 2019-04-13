package com.mfinder.mlucard;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author mfinder
 * @createdAt Mar 16, 2019
 */

@Component
@ApplicationPath("/mfinder/v1.0/")
public class JerseyConfig extends ResourceConfig {
	
	@Autowired
    public JerseyConfig(ObjectMapper objectMapper) {
        packages("com.example.demo.restful"); 
        register(new ObjectMapperContextResolver(objectMapper));
    }
	
	@Provider
	public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
	    private final ObjectMapper mapper;
	    
	    public ObjectMapperContextResolver(ObjectMapper mapper) {
	      this.mapper = mapper;
	    }
	    
	    @Override
	    public ObjectMapper getContext(Class<?> type) {
	      return mapper;
	    }
	}
}
