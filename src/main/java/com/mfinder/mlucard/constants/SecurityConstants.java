
package com.mfinder.mlucard.constants;

/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
public class SecurityConstants {
	public static final String RESOURCE_ID = "resource-server-rest-api";
	public static final String SECURED_READ_SCOPE = "#oauth2.hasScope('read')";
	public static final String SECURED_WRITE_SCOPE = "#oauth2.hasScope('write')";
	public static final String SECURED_PATTERN = "/secured/**";
	    
	public static final String AUTH_LOGIN_URL = "/api/auth";
	public static final String JWT_SECRET = "xxxx";
	public static final String TOKEN_HEADER = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String TOKEN_TYPE = "JWT";
	public static final String TOKEN_ISSUER = "secure-api";
	public static final String TOKEN_AUDIENCE = "secure-app";
	
	
	public static final String API_ENDPOINTS = "/api/";
}
