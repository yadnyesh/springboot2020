package io.yadnyesh.springboot2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Springboot2020Application {
	public static void main(String[] args) {
		SpringApplication.run(Springboot2020Application.class, args);
	}
}
