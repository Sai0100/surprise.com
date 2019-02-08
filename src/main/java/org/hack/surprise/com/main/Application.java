package org.hack.surprise.com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "org.hack.surprise.com.main.model")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//Commit check
	}

}

