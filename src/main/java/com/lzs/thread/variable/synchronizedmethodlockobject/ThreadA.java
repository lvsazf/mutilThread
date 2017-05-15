package com.lzs.thread.variable.synchronizedmethodlockobject;

public class ThreadA implements Runnable {
	
	private MyObject myObject;
	
	public ThreadA() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreadA(MyObject myObject){
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		myObject.methodA();
	}

}
