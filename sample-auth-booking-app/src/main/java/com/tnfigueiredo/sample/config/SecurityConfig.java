/**
 * 
 */
package com.tnfigueiredo.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author tnfigueiredo
 *
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.oauth2Login()
			.loginPage("/oauth2/authorization/booking-sample-client")
			.and()
			.authorizeRequests()
				.mvcMatchers("/bookings/**").authenticated()
				.anyRequest().denyAll();
	}

}
