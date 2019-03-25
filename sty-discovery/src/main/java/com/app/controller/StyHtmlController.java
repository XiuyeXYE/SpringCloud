package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyHtmlController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
}
