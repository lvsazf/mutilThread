package com.lzs.thread.happenbefore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {
	
	
	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(Run.class);
//		ReorderExample order = new ReorderExample();
//		for (int i = 0; i < 10000; i++) {
//			new Thread(() -> order.writer()).start();
//			new Thread(() -> order.reader()).start();
//		}
		
		logger.debug("this is a test");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
	
}

