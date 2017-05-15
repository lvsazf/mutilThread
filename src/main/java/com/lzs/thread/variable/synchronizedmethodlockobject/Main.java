package com.lzs.thread.variable.synchronizedmethodlockobject;

public class Main {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		MyObject myObject = new MyObject();
		new Thread(new ThreadA(myObject),"A").start();
		new Thread(new ThreadB(myObject),"B").start();
	}
	
}

