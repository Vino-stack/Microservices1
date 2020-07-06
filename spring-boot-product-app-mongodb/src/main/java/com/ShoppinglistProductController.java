package com;


import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppinglistProductController {
	
	
	@Value("${server.port}")
	private String port;
	
	@Autowired(required = true)
	private RestTemplate restTemplate;
	
	Logger logger=Logger.getLogger("com.ShoppinglistProductController");

	public ShoppinglistProductController() {
		logger.info("=====ShoppinglistProductController Created====");
}
	
	@GetMapping("cust1/namelist")
	public String getAllProducts(){
		logger.info("=====ShoppinglistProductController calling getAllcustomers====");
		return restTemplate.getForObject("http://localhost:1823/names",String.class);
	}
		
}
