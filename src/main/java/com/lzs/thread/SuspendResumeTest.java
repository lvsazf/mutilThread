package com.lzs.thread;

public class SuspendResumeTest extends Thread{
	private Integer i = 0;

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			i++;
		}
	}
	
}
