package com.ctl.training;

import java.util.Hashtable;

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
public class SpringBootDataservice2Application {

	private static Logger log = LoggerFactory.getLogger(SpringBootDataservice2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataservice2Application.class, args);
	}

	@RequestMapping(value = "/customer/{cid}/vehicledetails", method = RequestMethod.GET)
	public @ResponseBody String getCustomerVehicleDetails(@PathVariable Integer cid) throws InterruptedException {

		String result;

		log.info("DB query started");

		Thread.sleep(500);

		Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
		vehicles.put(100, "Hyundai S; Plate KA016777");
		vehicles.put(101, "Ford F; Plate KA0398121");
		vehicles.put(102, "Maruti B; Plate KA0478912");

		result = vehicles.get(cid);

		log.info("DB query completed");

		return result;
	}
}
