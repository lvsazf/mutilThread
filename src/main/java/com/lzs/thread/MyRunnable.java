package com.lzs.thread;

public class MyRunnable implements Runnable {
	private Integer num = 5;

	public MyRunnable() {
		super();
	}

	@Override
	synchronized public void run() {
		num--;
		System.out.println(Thread.currentThread().getName() + ":计算num：" + num);
	}

}
