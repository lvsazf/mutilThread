package com.lzs.thread;

/**
 * 方法interrupt和return实现线程停止
 * @author Administrator
 *
 */
public class UseReturnInterrupt extends Thread{
	@Override
	public void run() {
		super.run();
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("线程停止了");
				return;
			}
			System.out.println("System.currentTimeMillis(): " + System.currentTimeMillis());
		}
	}
}
