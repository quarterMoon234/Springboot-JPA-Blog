package com.example.demo.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
	return "<h1>Hello sang234</h1>";
	
	}

}
