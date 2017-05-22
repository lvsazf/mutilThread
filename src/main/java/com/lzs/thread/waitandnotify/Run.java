package com.lzs.thread.waitandnotify;

/**
 * 生产者消费者问题
 * @author lzs
 * 2017年5月22日下午9:48:28
 */
public class Run {
	
	public static void main(String[] args) {
		Info info = new Info();
		new Thread(new Producer(info)).start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Consumer(info)).start();
		
	}
	
}
