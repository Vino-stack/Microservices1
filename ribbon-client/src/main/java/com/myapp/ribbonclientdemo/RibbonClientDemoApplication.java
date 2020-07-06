package com.myapp.ribbonclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class RibbonClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientDemoApplication.class, args);
	}

}
