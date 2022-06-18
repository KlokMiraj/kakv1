package com.example.kak.kakv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@EnableAutoConfiguration

public class Kakv1Application {

	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(Kakv1Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8082"));
		app.run(args);
	}

	@GetMapping
	public RedirectView index(){
		return new RedirectView("/Layout");
	}


}

