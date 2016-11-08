package com.bridge.serviceImpl;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.bridge.serviceInterface.TestService;

public class TestServiceImpl implements TestService{

	 private static Logger LOGGER = Logger.getLogger(TestServiceImpl.class);
	 
	public String testService() {

		LOGGER.info("test service being called");
		return "Hello World";
		
	}

}
