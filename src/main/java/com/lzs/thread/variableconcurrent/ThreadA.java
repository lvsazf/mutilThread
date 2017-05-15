package com.lzs.thread.variableconcurrent;

public class ThreadA extends Thread {
	private HasSelfPrivateNum hasSelfPrivateNum;
	
	public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
		// TODO Auto-generated constructor stub
		this.hasSelfPrivateNum = hasSelfPrivateNum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		hasSelfPrivateNum.setNum("a");
	}
}
