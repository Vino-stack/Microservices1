package com.myapp.ribbonclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RibbonClients(
		{
		@RibbonClient(name = "customer-service", configuration = RibbonClientConfiguration.class),
		@RibbonClient(name = "shoppinglist-product-service",  configuration = RibbonClientConfiguration.class)
		}
		)


public class ProductServiceController {

	@Autowired
	RestTemplate restTemplate;
	

	
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
	
	@RequestMapping("/customerss")
  public String getAllProducts() {		
		String names = restTemplate.getForObject("http://customer-service/names", String.class);
		return names;
	}
	

	@RequestMapping("/products/list")
	  public String getAllProductsList() {		
			String names = restTemplate.getForObject("http://shoppinglist-product-service/cust1/namelist", String.class);
			return names;
		}
		

	
	@HystrixCommand(fallbackMethod="reliable")
	@GetMapping("/userdetails")
	public String getUsersDetails(){
		return restTemplate.getForObject("http://localhost:2525/newusers", String.class);
	}
	
	public String reliable(){
		return "Dear User, Our Site is facing some issue\n Sorry for Inconvenience .Please try after some time";
	}


}