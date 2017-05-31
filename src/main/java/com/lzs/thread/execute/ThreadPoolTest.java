package com.lzs.thread.execute;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	public static void main(String[] args) {
		//创建等待队列 
		BlockingQueue<Runnable> bqueues = new ArrayBlockingQueue<Runnable>(20);
		//创建线程池，池中保存的线程数为3，允许的最大线程数为5
		ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 50, TimeUnit.MICROSECONDS, bqueues);
		for (int i = 0; i < 7; i++) {
			pool.execute(new MyThread());
		}
		//关闭线程池
		pool.shutdown();
	}
}
