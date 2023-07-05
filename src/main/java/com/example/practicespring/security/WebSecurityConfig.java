package com.example.practicespring.security;

import com.example.practicespring.security.jwt.AuthFilter;
import com.example.practicespring.security.jwt.EntryPointJwt;
import com.example.practicespring.security.service.UserDetailsImpl;
import com.example.practicespring.security.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class WebSecurityConfig {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    EntryPointJwt unauthorizedHandler;
    @Bean
    public AuthFilter authenticationJwtTokenFilter(){
        return new AuthFilter();
    }
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//
//        authProvider.setUserDetailsService(userDetailsService);
//        authProvider.setPasswordEncoder(passwordEncoder());
//
//        return authProvider;
//    }
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
//        return authConfig.getAuthenticationManager();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//


}
