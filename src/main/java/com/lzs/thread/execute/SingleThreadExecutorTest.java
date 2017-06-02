package com.lzs.thread.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SingleThreadExecutorTest {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		IntStream.range(0, 5).forEach(n -> service.execute(() -> System.out.println(Thread.currentThread().getName())));
		service.shutdown();
		service.awaitTermination(5, TimeUnit.SECONDS);
	}
	
}
