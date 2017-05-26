package com.lzs.thread.synchronize.block;

public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		Thread threadA = new Thread(new ThreadA(service),"ThreadA");
		Thread threadB = new Thread(new ThreadB(service),"ThreadB");
		
		threadA.start();
		threadB.start();
	}
	
}
