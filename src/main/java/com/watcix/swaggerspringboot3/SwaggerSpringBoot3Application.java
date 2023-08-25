package com.watcix.swaggerspringboot3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot3 with new version of Swagger UI",
                version="1.0.0",
                description = "Spring Boot3 with Swagger UI",
                termsOfService = "https://devkit-ankit.tech/",
                contact = @Contact(
                        name = "Mr Ankit Kumar",
                        email = "ankit687kumar@gmail.com"
                ),
                license = @License(
                        name = "licence",
                        url = "https://devkit-ankit.tech/"
                )
        )
)
public class SwaggerSpringBoot3Application {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringBoot3Application.class, args);
    }

}
