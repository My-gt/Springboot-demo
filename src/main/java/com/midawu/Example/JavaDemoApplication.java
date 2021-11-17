package com.midawu.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaDemoApplication {

	@GetMapping ("/message")
	public String message() {
		return "hello from Azure pipeline!!";
	}
	public static void main(String[] args) {


		SpringApplication.run(JavaDemoApplication.class, args);
	}

}
