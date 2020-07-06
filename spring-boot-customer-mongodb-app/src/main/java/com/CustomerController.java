package com;


import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	
	@Value("${server.port}")
	private String port;
	
	
	Logger logger=Logger.getLogger("com.CustomerController");

	public CustomerController() {
		logger.info("=====CustomerController Created====");
}
	
	@GetMapping("/names")
	public List<String> getAllProducts(){
		logger.info("=====CustomerController calling getAllProducts====");
		return Arrays.asList("Vino","Vive","Vinotha",port);
	}
		
}
