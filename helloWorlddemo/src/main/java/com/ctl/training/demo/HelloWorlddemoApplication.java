package com.ctl.training.demo;

import java.util.Arrays;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloWorlddemoApplication {
	
	 
	private static final Logger LOGGER = LogManager.getLogger(HelloWorlddemoApplication.class);
	
	@RequestMapping("/hello")
	public String helloWorld() {
		LOGGER.info("Call to springboot hello method");
		return "Hello, Welcome to SB training!!";
	}

	public static void main(String[] args) {
			
		SpringApplication SpringbootRestJpaApplication = new SpringApplication(HelloWorlddemoApplication.class);
    	
    	ConfigurableApplicationContext ctx = SpringbootRestJpaApplication.run(args);

        // Echo the beans to the console for future tuning
    	LOGGER.info(">>SPRING BOOT BEANS:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
        	LOGGER.info(">>>>BEAN: "+ beanName);
        }
	}
}
