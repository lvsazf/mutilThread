package com.lzs.thread.synchronize.block;

public class ThreadA implements Runnable {
	
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.setUsernmePassword("A", "AA");
	}

}
