package com.mfinder.mlucard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mfinder.mlucard")
public class MlucardApplication {
	public static void main(String[] args) {
		SpringApplication.run(MlucardApplication.class, args);
	}
}
