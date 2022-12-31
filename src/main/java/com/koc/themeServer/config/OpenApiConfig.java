package com.koc.themeServer.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion) {
        Info info = new Info().title("Yas API").version(appVersion)
                .description("Spring Boot 기반 Yas API")
                .contact(new Contact().name("강성조").url("강성조@yas.com"))
                .license(new License().name("Apache License"));


        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}