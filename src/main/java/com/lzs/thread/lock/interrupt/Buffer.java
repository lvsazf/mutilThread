package com.lzs.thread.lock.interrupt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Buffer {
	
	private static Logger logger = LoggerFactory.getLogger(Buffer.class); 
	private Byte[] lock = new Byte[1];
	
	public void write(){
		synchronized (lock) {
			long startTime = System.currentTimeMillis();
			logger.info("开始向buffer写入数据！");
			for(;;){//模拟耗时操作
				if(System.currentTimeMillis() - startTime > Integer.MAX_VALUE)
					break;
			}
			logger.info("操作完毕");
		}
	}
	
	public void read(){
		
		synchronized (lock) {
			logger.info("从buffer中取数据！");
		}
		
	}
	
}
