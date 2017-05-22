package com.lzs.thread.waitandnotify;

public class Consumer implements Runnable {

	private Info info = null;

	public Consumer(Info info) {
		super();
		this.info = info;
	}

	public Consumer() {
		super();

	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			info.get();
		}
		
	}

}
