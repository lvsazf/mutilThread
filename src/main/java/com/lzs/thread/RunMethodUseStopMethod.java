package com.lzs.thread;

public class RunMethodUseStopMethod extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("---");
			e.printStackTrace();
		}
	}
}
