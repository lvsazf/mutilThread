package com.lzs.thread.variable.synchronizedmethodlockobject;

public class MyObject {
	public synchronized void methodA() {
		try {
			System.out.println("begin methodA threadName: " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("end endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  void methodB() {
		try {
			System.out.println("begin methodB threadName: " + Thread.currentThread().getName() + "beginTime="
					+ System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
