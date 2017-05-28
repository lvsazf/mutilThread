package com.lzs.thread.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCacheThreadPool {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "线程被调用了。");
				}
			});
			System.out.println("************* a" + i + " *************"); 
		}
		executorService.shutdown();
	}
	
}
