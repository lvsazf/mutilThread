package com.lzs.thread;

public class MyRunnable implements Runnable {
	private String name;

	private Integer num = 5;

	public MyRunnable() {
		super();
	}

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	synchronized public void run() {
		num--;
		System.out.println(Thread.currentThread().getName() + ":计算num：" + num);
	}

}
