package com.lzs.thread.lock.interrupt;

import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Buffer2 {

	private static Logger logger = LoggerFactory.getLogger(Buffer2.class);
	private ReentrantLock lock = new ReentrantLock();

	public void write() {
		lock.lock();
		try {
			long startTime = System.currentTimeMillis();
			logger.info("开始向buffer写入数据！");
			for (;;) {// 模拟耗时操作
				if (System.currentTimeMillis() - startTime > Integer.MAX_VALUE)
					break;
			}
			logger.info("操作完毕");
		} finally {
			lock.unlock();
		}

	}

	public void read() throws InterruptedException {
		lock.lockInterruptibly();
		try {
			logger.info("从buffer中取数据！");
		} finally {
			lock.unlock();
		}
		
		
	}

}
