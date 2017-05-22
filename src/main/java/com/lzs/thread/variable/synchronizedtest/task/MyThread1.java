package com.lzs.thread.variable.synchronizedtest.task;

public class MyThread1 implements Runnable{
	
	private MyTask task;
	
	public MyThread1() {
		
	}
	public MyThread1(MyTask task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		CommonUtil.beginTime = System.currentTimeMillis();
		task.doLongTime();
		CommonUtil.endTime = System.currentTimeMillis();
		
			
	}
	
}
