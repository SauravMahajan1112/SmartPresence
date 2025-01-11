package com.tka.smartpresence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartPresenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartPresenceApplication.class, args);
		System.err.println("App Started");
	}

}
