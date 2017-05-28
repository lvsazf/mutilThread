package com.lzs.thread.volatiletest;

public class Run {
	
	public static void main(String[] args) {
		Num num = new Num();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				num.a = 1;
				num.b = 2;
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				if (num.b == 2) {
					System.out.println(num.a);
				}
				
			}
		}).start();;
		
	}
	
}
