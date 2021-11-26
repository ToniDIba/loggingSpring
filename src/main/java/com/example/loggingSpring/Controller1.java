package com.example.loggingSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller1 {


    @GetMapping("/parametros/")
    public String recogerValoresProperties() {

        final Logger log = LoggerFactory.getLogger(LoggingSpringApplication.class);
        log.info("Informacionm");
        System.out.println("Escribo log");
        return "hola";

    }

}