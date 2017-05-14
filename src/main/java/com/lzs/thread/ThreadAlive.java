package com.lzs.thread;

public class ThreadAlive extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("run=" + this.isAlive());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
