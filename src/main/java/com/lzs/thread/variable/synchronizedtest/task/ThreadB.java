package com.lzs.thread.variable.synchronizedtest.task;

public class ThreadB implements Runnable{

	private ObjectService service;

	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}

	public ThreadB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		service.serviceMethod();
	}
	
	
	
}
