package com.app.sty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.app.controller"})
public class StyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StyApplication.class, args);
	}

}
