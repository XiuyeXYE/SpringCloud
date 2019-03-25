package com.app.sty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.app.controller","com.app.service"})
public class StyApplication {

	@Bean
	@LoadBalanced
	public RestTemplate rt() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StyApplication.class, args);
	}

}
