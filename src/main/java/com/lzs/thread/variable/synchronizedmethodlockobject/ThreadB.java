package com.lzs.thread.variable.synchronizedmethodlockobject;

public class ThreadB implements Runnable {
	
	private MyObject myObject;
	
	public ThreadB() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreadB(MyObject myObject){
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
//		myObject.methodA();
		myObject.methodB();
	}

}
