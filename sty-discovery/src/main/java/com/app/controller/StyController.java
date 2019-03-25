package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StyService;

@RestController
public class StyController {
	
	@RequestMapping("home")
	public String home() {
		return "Home OK";
	}

	@Autowired
	private StyService ss;
	
	@RequestMapping("port")
	public String port() {
		return this.ss.getServicePort();
	}
	
	@RequestMapping("serivceIndexPage")
	public String serivceIndexPage() {
		return this.ss.getServiceIndexPage();
	}
	
	
}
