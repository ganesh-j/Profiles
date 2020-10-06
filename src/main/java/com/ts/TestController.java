package com.ts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${dev.msg}")
	private String greetings;
	
	@GetMapping("/profiles")
	public String sayGreetings() {
		return greetings;
	}

	

}
