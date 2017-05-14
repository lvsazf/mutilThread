package com.lzs.thread;

public class UseStopMethodThreadTest extends Thread {
	private Integer i = 0;

	@Override
	public void run() {
		super.run();
		try {
			while (true) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
