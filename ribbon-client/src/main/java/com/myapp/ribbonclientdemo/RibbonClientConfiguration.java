package com.myapp.ribbonclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class RibbonClientConfiguration {

	public RibbonClientConfiguration() {
	System.out.println("CustomerRibbonServiceConfiguration created...");
	}
	
	@Autowired
    IClientConfig ribbonClientConfig;
    
	@Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
    
	@Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }

}
