package com.example.loggingSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoggingSpringApplication implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(LoggingSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingSpringApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {
			System.out.println("\n" + "Saludos desde main()...");
			log.debug("Esto es un mensaje de debug");
			log.info("Esto es un mensaje de info");
			log.error("Salida ERROR desde la clase EjemploLog");
			log.trace("Esto es una traza");

		}

}
