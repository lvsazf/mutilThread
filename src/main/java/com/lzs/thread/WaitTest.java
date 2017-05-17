package com.lzs.thread;

public class WaitTest {
	
	public static void main(String[] args) {
		WaitTest waitTest = new WaitTest();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				waitTest.testWait();
			}
		}).start();
	}
	
	public synchronized void testWait(){
		System.out.println("start");
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
}
