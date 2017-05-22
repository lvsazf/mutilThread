package com.lzs.thread.variable.synchronizedtest.task;


public class ThreadA implements Runnable{
	
	private ObjectService service;
	
	public ThreadA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThreadA(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.serviceMethod();
	}
}
