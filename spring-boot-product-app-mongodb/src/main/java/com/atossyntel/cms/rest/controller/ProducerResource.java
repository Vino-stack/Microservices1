package com.atossyntel.cms.rest.controller;
/*
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

@RequestMapping("/rest/publish")
@RestController
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;


    @Autowired
    Topic topic;

    
    public ProducerResource() {
		// TODO Auto-generated constructor stub
    	System.out.println(" products resource RestController created...");
	}


	@GetMapping("/{message}")
    public String publish(@PathVariable("message")
                          final String message) {
		System.out.println(" products resource1 RestController created...");

        jmsTemplate.convertAndSend(topic,message+" @ "+new Date());
        
        return message+"  [Message]  : Published Successfully";
    }
}
*/