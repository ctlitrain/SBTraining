package com.ctl.training.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigClientApplication implements CommandLineRunner {

	@Value("${message:hello default}")
	private String message;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		System.out.println("\nWelcome message = " + message);

	}
}
