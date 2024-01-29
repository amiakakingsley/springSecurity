package com.amiaka.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityfilaterChain(HttpSecurity http) throws Exception {
	   return http.csrf(csrf -> csrf.disable())
			   .authorizeHttpRequests(auth -> {auth
					   .requestMatchers("/home").permitAll()
					   .requestMatchers("/secured").authenticated();
			   }).oauth2Login(Customizer.withDefaults())
			   .formLogin(Customizer.withDefaults())
			  
			   .build();
	}
	
	
	
	
	

	
	
}
