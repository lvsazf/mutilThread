package com.lzs.thread.execute;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadExecutorTest {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor executors = new ScheduledThreadPoolExecutor(1);
		executors.scheduleAtFixedRate(() -> System.out.println(System.currentTimeMillis()), 1000L, 2000L, TimeUnit.MICROSECONDS);
		try {
			executors.shutdown();
			executors.awaitTermination(3000L, TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
