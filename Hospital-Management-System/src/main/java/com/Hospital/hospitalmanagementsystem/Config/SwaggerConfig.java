package com.Hospital.hospitalmanagementsystem.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Hospital-Management-System API").version("1.0"));

    }
}


/*
import io.swagger.v3.oas.models.security.SecurityRequirement;
import java.util.Arrays;

.addSecurityItem(new SecurityRequirement().addList("basicScheme"))
                .security(Arrays.asList(
                        new SecurityRequirement().addList("basicScheme"),
                        new SecurityRequirement().addList("bearerAuth")));
 */