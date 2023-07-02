package com.swapnilxi.ezybankapplication.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    @Bean
SecurityFilterChain defauSecurityFilterChain(HttpSecurity http) throws Exception{
    //<---old style--->
    // http.authorizeHttpRequests().requestMatchers("/myaccount/*", "/mybalance", "/mycards","/myloans").authenticated()
    // .requestMatchers("/notices","/contact").permitAll()
    // .and().formLogin()
    // .and().httpBasic();
        //<--new style-->
        http.authorizeHttpRequests(( requests ) ->requests
        .requestMatchers("/myAccount","/myBalance","/myLoans","/myCa rds").authenticated()
        .requestMatchers ("/notices", "/contact") .permitAll())
        . formLogin(Customizer.withDefaults())
        . httpBasic(Customizer.withDefaults()) ;
        return http.build();

    

}
    
}
