package com.lzs.thread.variable.synchronizedtest.task;

public class MyThread2 implements Runnable {

	private MyTask task;

	public MyThread2() {
		
	}

	public MyThread2(MyTask task) {
		this.task = task;
	}

	@Override
	public void run() {
		CommonUtil.beginTime2 = System.currentTimeMillis();
		task.doLongTime();
		CommonUtil.endTime2 = System.currentTimeMillis();

	}

}
