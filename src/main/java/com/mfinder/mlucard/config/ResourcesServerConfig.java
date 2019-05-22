package com.mfinder.mlucard.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mfinder.mlucard.constants.SecurityConstants;
import com.mfinder.mlucard.handler.LoggingAccessDeniedHandler;


@Configuration
@EnableResourceServer
public class ResourcesServerConfig extends ResourceServerConfigurerAdapter {
	
	@Autowired private LoggingAccessDeniedHandler accessDeniedHandler;
	
    @Override
    public void configure(final ResourceServerSecurityConfigurer resources) {
        resources.resourceId(SecurityConstants.API_ENDPOINTS);
    }
    
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//    	http.authorizeRequests().antMatchers("/", "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll()
//		.antMatchers("/user/**").hasRole("USER").anyRequest().authenticated().and().formLogin()
//		.loginPage("/login").permitAll().and().logout().invalidateHttpSession(true).clearAuthentication(true)
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
//		.permitAll().and().exceptionHandling().accessDeniedHandler(accessDeniedHandler);
//    }
}
