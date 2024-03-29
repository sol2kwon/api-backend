package com.solyi.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName: net.zerotoweb.api
 * fileName   : CorsConfig
 * author     : parkjungkwan
 * date       : 2022-02-24
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-24   parkjungkwan  최초 생성
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedMethods(CorsConfiguration.ALL)
                .allowedHeaders(CorsConfiguration.ALL)
                .allowedOriginPatterns(CorsConfiguration.ALL);
    }
};


