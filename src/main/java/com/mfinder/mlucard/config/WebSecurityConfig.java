package com.mfinder.mlucard.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;


/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private final DataSource dataSource;
    private PasswordEncoder passwordEncoder;


	public WebSecurityConfig(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Bean
	public JdbcClientDetailsService jdbcClientDetailsService() {
		return new JdbcClientDetailsService(this.dataSource);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		if (passwordEncoder == null) {
			passwordEncoder = PasswordEncoderFactorieConfig.createDelegatingPasswordEncoder();
		}

		return passwordEncoder;
	}
	
}




//private PasswordEncoder passwordEncoder;
//private UserDetailsService userDetailsService;
//@Override
//protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//	auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//}
//
//@Bean
//@Override
//public UserDetailsService userDetailsService() {
//	if (userDetailsService == null) {
//		userDetailsService = new JdbcDaoImpl();
//		((JdbcDaoImpl) userDetailsService).setDataSource(dataSource);
//	}
//	return userDetailsService;
//
//}

