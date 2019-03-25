package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StyService {

	@Autowired
	private RestTemplate rt;
	
	public String getServicePort() {
		return rt.getForObject("http://eurka-client2/port", String.class);
	}
	
	public String getServiceIndexPage() {
		return rt.getForObject("http://eurka-client2/index", String.class);
	}
	
}
