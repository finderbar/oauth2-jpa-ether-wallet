
package com.mfinder.mlucard;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author mfinder
 * @createdAt Mar 16, 2019
 */

@Component
@ApplicationPath("/mfinder/v1.0/")
public class JerseyConfig extends ResourceConfig  {
	public JerseyConfig() {
		packages("com.mfinder.mlucard.api");
    }
}
