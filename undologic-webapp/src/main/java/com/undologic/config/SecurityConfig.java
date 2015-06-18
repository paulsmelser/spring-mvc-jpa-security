package com.undologic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;

import javax.sql.DataSource;

/**
 * Created by psmelser on 31/05/15.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(
                        "select username,password, enabled from users where username=?")
                .authoritiesByUsernameQuery(
                        "select username, role from user_roles where username=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin/**").access("hasRole('ROLE_USER')")
//                .and()
//                .formLogin().loginPage("/login").failureUrl("/login?error")
//                .usernameParameter("security_username")
//                .passwordParameter("security_password")
//                .usernameParameter("username").passwordParameter("password")
//                .and()
//                .logout().logoutSuccessUrl("/login?logout")
//                .and()
//                .csrf();
        http.authorizeRequests()
                .antMatchers("/resources/**", "/signup", "/about").permitAll()
                .antMatchers("/").hasRole("USER")
                .antMatchers("/admin").hasRole("USER")
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/", true)
                .failureUrl("/login?error")
                .usernameParameter("security_username")
                .passwordParameter("security_password")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .logoutUrl("/logout")
                .permitAll()
                .and()
                .csrf()
                .disable();
    }


    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
