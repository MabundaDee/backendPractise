package com.example.practicespring.security;

import com.example.practicespring.security.jwt.AuthFilter;
import com.example.practicespring.security.jwt.EntryPointJwt;
import com.example.practicespring.security.service.UserDetailsImpl;
import com.example.practicespring.security.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class WebSecurityConfig {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    EntryPointJwt unauthorizedHandler;
    @Bean
    public AuthFilter autheticationJwtTokenFilter(){
        return new AuthFilter();
    }

}
