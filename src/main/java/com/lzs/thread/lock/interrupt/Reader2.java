package com.lzs.thread.lock.interrupt;

public class Reader2 implements Runnable {
	
	private Buffer2 buffer;
	
	public Reader2(Buffer2 buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			buffer.read();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("不读了");
			
		}
		System.out.println("读结束");
	}

}
