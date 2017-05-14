package com.lzs.thread;

public class ThreadInterruptTest extends Thread {
	@Override
	public void run() {
		super.run();
		try{
			for (int i = 0; i < 50000; i++) {
//				if(this.interrupted()){
//					System.out.println("已是停止状态，退出");
//					throw new InterruptedException();
//				}
				Thread.sleep(20000);
				System.out.println("i= " + (i + 1));
			}
			System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
		}catch(InterruptedException e){
			System.err.println("在sleep中被停止进入catch方法了" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
