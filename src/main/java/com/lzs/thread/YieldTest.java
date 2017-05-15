package com.lzs.thread;

public class YieldTest extends Thread {
	
	@Override
	public void run() {
		super.run();
		long start = System.currentTimeMillis();
		int count = 0;
		for(int i = 0;i < 50000000 ; i++){
			Thread.yield();
			count = count + (i + 1);
		}
		System.out.println("共耗时" + (System.currentTimeMillis() - start));
	}
	
}
