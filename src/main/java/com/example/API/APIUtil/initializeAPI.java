package com.example.API.APIUtil;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class initializeAPI implements ApplicationContextInitializer {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		// TODO Auto-generated method stub
		System.out.println("<scope>compile</scope>");
		AipFaceUtil client = new AipFaceUtil();
		client.init();
	}

}
