package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception { //"/users","/members"
      http.authorizeRequests().antMatchers("/trachers","/managers")
        .access("hasRole('ROLE.USER')")
        .antMatchers("/","/**").access(("permitAll"))
        .and()
        .httpBasic();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("root")
        .password("{noop}1")
        .authorities("ROLE_USER")
        .and()
        .withUser("root2")
        .password("{noop}1")
        .authorities("ROLE_USER");
    }
}
