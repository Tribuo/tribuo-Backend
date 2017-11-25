/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.configuration;

import org.pac4j.core.config.Config;
import org.pac4j.springframework.web.SecurityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Camilo
 */
//@Configuration
//@ComponentScan(basePackages = "org.pac4j.springframework.web")
public class SecurityConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Config config;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SecurityInterceptor(config, "GoogleOidcClient")).addPathPatterns("/oidc/*");
        registry.addInterceptor(new SecurityInterceptor(config)).addPathPatterns("/protected/*");
    }
}
