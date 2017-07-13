package com.lzs.thread.lock.interrupt;

public class Reader implements Runnable {
	
	private Buffer buffer;
	
	public Reader(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.read();
	}

}
