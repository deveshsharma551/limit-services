package com.example.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservices.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private LimitConfiguration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
	   return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
