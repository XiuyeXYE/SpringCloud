package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StyController {
	
	@RequestMapping("home")
	public String home() {
		return "Home OK";
	}

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("port")
	public String port() {
		return "<h1 style=color:green>service:"+port+" provides service!<h1>";
	}
	
}
