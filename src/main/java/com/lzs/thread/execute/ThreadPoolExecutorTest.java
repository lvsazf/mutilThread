package com.lzs.thread.execute;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
	public static void main(String[] args) {
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);
		ThreadPoolExecutor executors = new ThreadPoolExecutor(3, 5, 1000L, TimeUnit.MICROSECONDS, workQueue);
		for (int i = 0; i < 10; i++) {
			executors.execute(()->System.out.println(Thread.currentThread().getName()));
		}
		executors.shutdown();
	}
}
