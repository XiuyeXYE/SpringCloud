package com.app.sty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StyApplication.class, args);
	}

}
