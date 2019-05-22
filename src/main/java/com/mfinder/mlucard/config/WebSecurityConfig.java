package com.mfinder.mlucard.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mfinder.mlucard.handler.LoggingAccessDeniedHandler;

/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private final DataSource dataSource;
	private PasswordEncoder passwordEncoder;
	private UserDetailsService userDetailsService;
	private LoggingAccessDeniedHandler accessDeniedHandler;

	public WebSecurityConfig(final DataSource dataSource, final LoggingAccessDeniedHandler accessDeniedHandler) {
		this.dataSource = dataSource;
		this.accessDeniedHandler = accessDeniedHandler;
	}

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
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

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		if (userDetailsService == null) {
			userDetailsService = new JdbcDaoImpl();
			((JdbcDaoImpl) userDetailsService).setDataSource(dataSource);
		}
		return userDetailsService;

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll()
				.antMatchers("/user/**").hasRole("USER_ANONYMOUS").anyRequest().authenticated().and().formLogin()
				.loginPage("/login").permitAll().and().logout().invalidateHttpSession(true).clearAuthentication(true)
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
				.permitAll().and().exceptionHandling().accessDeniedHandler(this.accessDeniedHandler);
	}
}
