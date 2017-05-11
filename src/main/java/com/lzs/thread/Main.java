package com.lzs.thread;

public class Main {

	public static void main(String[] args) {
		MyThread m1 = new MyThread("m1");
		MyThread m2 = new MyThread("m2");
//		m1.start();
//		m2.start();
		MyRunnable my = new MyRunnable();
		new Thread(my,"A").start();;
		new Thread(my,"B").start();;
		new Thread(my,"C").start();;
		new Thread(my,"D").start();;
		new Thread(my,"E").start();;
	}
}
