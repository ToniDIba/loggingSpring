package com.example.loggingSpring;



import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.apache.logging.log4j.LogManager.getLogger;


@SpringBootApplication
public class LoggingSpringApplication implements CommandLineRunner {


	static Logger log = getLogger(LoggingSpringApplication.class.getName());

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
