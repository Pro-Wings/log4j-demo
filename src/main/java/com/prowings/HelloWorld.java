package com.prowings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class HelloWorld {
	
    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) throws InterruptedException {
		ThreadContext.put("transaction Id : ", "123123123123123"); 

    	logger.fatal("Fatal level event!!");
    	logger.error("Error level event!!");
    	logger.warn("Warn level event!!");
    	logger.info("info level event!!");
    	logger.debug("Debug level event!!");
    	logger.trace("Trace level event!!");
    	
    	addition(1012312312 , 30);
	}

	private static void addition(int i, int j) throws InterruptedException {
		
		
		logger.info("addition method started");
		
		int res = i + j;
		logger.info("Result is {}",res);
		
		Thread.sleep(50000);
		logger.info("addition method ended");
		
	}

    
    
}
