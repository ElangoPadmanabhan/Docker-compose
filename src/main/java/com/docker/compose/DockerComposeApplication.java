package com.docker.compose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerComposeApplication {

	@RequestMapping("/")
	public String home() {
		return "Welcome to docker compose application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerComposeApplication.class, args);
	}

}
