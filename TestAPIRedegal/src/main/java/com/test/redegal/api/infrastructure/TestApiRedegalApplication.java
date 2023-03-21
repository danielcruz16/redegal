package com.test.redegal.api.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.test.redegal.api")
@EnableJpaRepositories("com.test.redegal.api.repository.jpa")
@EntityScan("com.test.redegal.api.repository.jpa.model")
public class TestApiRedegalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiRedegalApplication.class, args);
	}

}
