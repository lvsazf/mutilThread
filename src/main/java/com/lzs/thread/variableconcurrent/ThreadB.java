package com.lzs.thread.variableconcurrent;

public class ThreadB extends Thread {
	private HasSelfPrivateNum hasSelfPrivateNum;

	public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
		// TODO Auto-generated constructor stub
		this.hasSelfPrivateNum = hasSelfPrivateNum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		hasSelfPrivateNum.setNum("b");
	}
}
