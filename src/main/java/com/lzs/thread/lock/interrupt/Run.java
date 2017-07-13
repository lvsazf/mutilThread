package com.lzs.thread.lock.interrupt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {
	private static Logger logger = LoggerFactory.getLogger(Run.class);
	
	public static void main(String[] args) {
		
		Buffer2 buffer = new Buffer2();
		Thread write = new Thread(new Write2(buffer));
		write.start();
		Thread read = new Thread(new Reader2(buffer));
		read.start();
//		Buffer buffer = new Buffer();
//		Thread write = new Thread(new Write(buffer));
//		write.start();
//		Thread read = new Thread(new Reader(buffer));
//		read.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long startTime = System.currentTimeMillis();
				for(;;){
					if (System.currentTimeMillis() - startTime > 5000) {
						logger.info("中断");
						read.interrupt();
						break;
					}
				}
			}
		}).start();
		
		
		
	}
	
}
