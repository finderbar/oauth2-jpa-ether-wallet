package com.mfinder.mlucard.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;


@Configuration
@PropertySource({ "classpath:persistence.properties" })
public class AuthorizationServerConfigInMemory extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	private Environment env;
	
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authencationManager; 
	
	@Autowired
	private JdbcTokenStore tokenStore;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	// SERVER CONFIG
	@Override
	public void configure(final AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
		
	}
	
	// CLIENT CONFIG
	@Override
	public void configure(final ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
        .withClient("sampleClientId")
        .authorizedGrantTypes("implicit")
        .scopes("read", "write", "foo", "bar")
        .autoApprove(false).accessTokenValiditySeconds(3600)

        .and()
        .withClient("fooClientIdPassword")
        .secret(passwordEncoder.encode("secret"))
        .authorizedGrantTypes("password", "authorization_code", "refresh_token", "client_credentials")
        .scopes("foo", "read", "write")
        .accessTokenValiditySeconds(3600) // 1 hour
        .refreshTokenValiditySeconds(2592000) // 30 days

        .and()
        .withClient("barClientIdPassword")
        .secret(passwordEncoder.encode("secret"))
        .authorizedGrantTypes("password", "authorization_code", "refresh_token")
        .scopes("bar", "read", "write")
        .accessTokenValiditySeconds(3600) // 1 hour
        .refreshTokenValiditySeconds(2592000); // 30 days
	}
	
	// END POINTS CONFIG
	@Override
	public void configure(final AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		// something to do
	}
	
}
