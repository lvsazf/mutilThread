package com.lzs.thread;

public class VisibilityTest {
	
	private static boolean ready;
	private static int number;
	
	private static class readThread extends Thread{
		@Override
		public void run() {
			super.run();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!ready)
				System.out.println(ready);
			System.out.println(number);
		}
	}
	
	private static class writeThread extends Thread{
		@Override
		public void run() {
			super.run();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ready = true;
			number = 100;
		}
	}
	
	public static void main(String[] args) {
		new writeThread().start();
		new readThread().start();
	}
	
}
