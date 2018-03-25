package com.ctl.training.mvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctl.training.mvc.config.CustomTestConfig;

@SpringBootApplication
public class SpringbootRestJpaApplication implements CommandLineRunner {

	private static Logger log =  LogManager.getLogger();
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private CustomTestConfig customcfg;
		
	public static void main(String[] args) {
		// Setup the Application Context
		log.info(SpringbootRestJpaApplication.class.getName());
		SpringApplication.run(SpringbootRestJpaApplication.class, args); 
		
	}
	
	@Override
	public void run(String... args) {
		System.out.println("\n\nApplication name: " + appName);
		System.out.println("\n---Training---");
		System.out.println("\tTopic: " + customcfg.getTopic());
		System.out.println("\tTrainer: " + customcfg.getTrainer());
		System.out.println("\tDuation(in hours): " + customcfg.getDuration());
	}
		
}
