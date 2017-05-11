package com.lzs.thread;

public class MyThread extends Thread {
	private String name;
	
	private Integer num = 5;
	
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0;i < 5;i ++ ){
			num--;
			System.out.println(name + "计算num：" + num);
		}
	}
}
