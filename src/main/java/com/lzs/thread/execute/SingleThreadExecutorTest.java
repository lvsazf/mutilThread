package com.lzs.thread.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTest {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newSingleThreadExecutor();
//		IntStream.range(0, 5).forEach(n -> service.execute(() -> System.out.println(n + Thread.currentThread().getName())));
//		service.shutdown();
//		service.awaitTermination(5, TimeUnit.SECONDS);
		service.shutdown();
		
	}
	
}
