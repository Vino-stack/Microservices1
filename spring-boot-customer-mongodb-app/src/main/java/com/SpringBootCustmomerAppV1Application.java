package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;

//@EnableEurekaClient
//@SpringBootApplication(exclude = JmsAutoConfiguration.class)
@SpringBootApplication
public class SpringBootCustmomerAppV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustmomerAppV1Application.class, args);
	}

}
