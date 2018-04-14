package com.ctl.training;

import java.util.Hashtable;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDataservice1Application {
	
	private static Logger log = LoggerFactory.getLogger(SpringBootDataservice1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataservice1Application.class, args);
	}
	
	@RequestMapping(value="/customer/{cid}/contactdetails", method=RequestMethod.GET)
	public @ResponseBody String getCustomerContactDetails(@PathVariable Integer cid) throws InterruptedException {
		
		//add arbitrary latency
		Random r = new Random();
		int multiplier = r.nextInt(5) * 1000;
		log.info("multiplier: " + multiplier);
		Thread.sleep(multiplier);
		 
		
		Hashtable<Integer, String> customers = new Hashtable<Integer, String>();
		customers.put(100, "Rajesh M");
		customers.put(101, "Rahul L");
		customers.put(102, "Sachin K");
		
		String result = customers.get(cid);
		
		return result;
	}
}
