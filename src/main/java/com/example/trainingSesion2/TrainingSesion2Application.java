package com.example.trainingSesion2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class TrainingSesion2Application {

	public static void main(String[] args) {
		SpringApplication.run(TrainingSesion2Application.class, args);
	}

}
