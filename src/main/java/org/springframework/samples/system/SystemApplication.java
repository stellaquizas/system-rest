package org.springframework.samples.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SystemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}
} 