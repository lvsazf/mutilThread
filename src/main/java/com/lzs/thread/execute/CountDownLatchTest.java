package com.lzs.thread.execute;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountDownLatchTest {
	
	private final static Logger logger = LoggerFactory.getLogger(CountDownLatchTest.class);
	
	static class Person implements Runnable {

		private CountDownLatch latch;
		private Integer index;

		public Person(CountDownLatch latch, Integer index) {
			super();
			this.latch = latch;
			this.index = index;
		}

		@Override
		public void run() {

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			logger.info("Peron {} 签到！",index);
			latch.countDown();

		}
	}

	public static void main(String[] args) {
		Integer count = 10;
		CountDownLatch latch = new CountDownLatch(count);
		
		ExecutorService services = Executors.newFixedThreadPool(count);
		IntStream.rangeClosed(1, 10).forEach(i -> services.execute(new Person(latch, i)));
//		System.out.println("开始签到！");
		logger.info("开始签到！");
		
		try {
			latch.await();
			logger.info("签到完毕！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			services.shutdown();
		}
	}

}
