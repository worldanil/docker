package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Hello openshift ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
