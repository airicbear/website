package com.etndevel.website;

import com.etndevel.website.dao.GreetingRepo;
import com.etndevel.website.model.Greeting;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(GreetingRepo greetingRepo) {
		return args -> {
			greetingRepo.save(new Greeting("hello"));
			greetingRepo.save(new Greeting("hi"));
		};
	}
}
