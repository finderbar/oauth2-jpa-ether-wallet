package com.mfinder.mlucard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.mfinder.mlucard")
@EnableJpaRepositories("com.mfinder.mlucard")
@ComponentScan(basePackages = { "com.mfinder.mlucard" })
@EnableAutoConfiguration
public class MlucardApplication {
	public static void main(String[] args) {
		SpringApplication.run(MlucardApplication.class, args);
	}
}
