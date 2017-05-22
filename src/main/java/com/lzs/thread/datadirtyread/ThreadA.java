package com.lzs.thread.datadirtyread;

public class ThreadA implements Runnable {
	
	private PublicVar publicVar;
	
	public ThreadA(PublicVar publicVar) {
		this.publicVar = publicVar;
	}
	
	@Override
	public void run() {
		try {
			publicVar.setValue("B", "BB");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
