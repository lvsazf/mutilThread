package com.lzs.thread.variable.synchronizedtest.task;

public class Run {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread thread1 = new Thread(new MyThread1(task), "MyThread1");
		Thread thread2 = new Thread(new MyThread2(task), "MyThread2");
		thread1.start();
		thread2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long beginTime = CommonUtil.beginTime;
		if (CommonUtil.beginTime2 < CommonUtil.beginTime) {
			beginTime = CommonUtil.beginTime2;
		}

		long endTime = CommonUtil.endTime;

		if (CommonUtil.endTime2 > CommonUtil.endTime) {
			endTime = CommonUtil.endTime2;
		}
		
		System.err.println("耗时：" + (endTime-beginTime)/1000);
		
		System.out.println("-------------------------------------------------------------------------------------");
		ObjectService objectService = new ObjectService();
		
		Thread threadA = new Thread(new ThreadA(objectService));
		Thread threadB = new Thread(new ThreadB(objectService));
		threadA.setName("A");
		threadA.setName("B");
		threadA.start();
		threadB.start();
		
	}
}
