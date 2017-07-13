package com.lzs.thread.lock.interrupt;

public class Write implements Runnable {
	
	private Buffer buffer;
	
	public Write(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.write();

	}

}
