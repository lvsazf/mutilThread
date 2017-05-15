package com.lzs.thread;

public class StopThreadLock extends Thread{
	
	private SynchronizedObject object ;
	
	public StopThreadLock(SynchronizedObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		object.printObject("b", "bb");
	}
	
}
