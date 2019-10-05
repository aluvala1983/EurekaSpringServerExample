package com.learnjava.learnjavaeurkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class LearnjavaEurkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnjavaEurkaServerApplication.class, args);
	}

}
