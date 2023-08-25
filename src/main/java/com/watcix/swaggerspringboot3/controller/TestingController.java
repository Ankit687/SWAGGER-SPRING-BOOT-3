package com.watcix.swaggerspringboot3.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestingController {

    @GetMapping("/")
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping(value = "/swagger")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
//        response.sendRedirect("/swagger-ui/index.html");
    }

    @GetMapping(value = "/swagger-help")
    public void redirectSwaggerHelp(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://springdoc.org/");
    }
}
