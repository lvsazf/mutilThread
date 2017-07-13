package com.lzs.thread.lock.interrupt;

public class Write2 implements Runnable {
	
	private Buffer2 buffer;
	
	public Write2(Buffer2 buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.write();

	}

}
