package com.application.dnsehd.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test")
	public String main() {
		return "testfile";
	}
	
	@GetMapping("/xbox")
	public String xbox() {
		return "xbox";
	}
	
}
