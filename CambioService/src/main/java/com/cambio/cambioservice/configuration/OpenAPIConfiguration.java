package com.cambio.cambioservice.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(title = "Cambio Service API", version = "v1", description = "Cambio of Book Service API"))
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI customOpenAPI(){

        return new OpenAPI().components(new Components()).info(new io.swagger.v3.oas.models.info.Info()
                .title("Cambio Service API")
                .version("v1")
                .license(new License().name("No Licence").url("https://springdoc.org")));
    }
}
