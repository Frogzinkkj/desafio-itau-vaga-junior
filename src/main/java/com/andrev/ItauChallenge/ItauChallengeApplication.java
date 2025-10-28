package com.andrev.ItauChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ItauChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItauChallengeApplication.class, args);
	}

}
