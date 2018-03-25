/**
 * 
 */
package com.rxmeena.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;

/**
 * @author Rajesh
 *
 */
@SpringBootApplication
public class SpringbootTwitter4jDemoApplication implements CommandLineRunner {
	
	private static Logger logger = LogManager.getLogger(SpringbootTwitter4jDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTwitter4jDemoApplication.class, args);
	}

	@Autowired
	private Twitter twitter;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		logger.info("Get home timeline");
		ResponseList<Status> homeTimeline = twitter.getHomeTimeline();		
		for (Status status : homeTimeline) {
			logger.info(status.getText());
		}
		

	}

}
