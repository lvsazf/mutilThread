package com.lzs.thread.variable.synchronizedmethodlockobject;

public class Main {
	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * <p>MethodName: test</p>
	 * <p>Description: 调用用关键字synchronized 声明的方法一定是排队运行的</p>
	 * @Date 2017年5月16日下午5:24:57
	 * @author luzs
	 */
	public static void test() {
		MyObject myObject = new MyObject();
		new Thread(new ThreadA(myObject),"A").start();
		new Thread(new ThreadB(myObject),"B").start();
	}
	
	public static void test1(){
		MyObject myObject = new MyObject();
		new Thread(new ThreadA(myObject),"A").start();
		new Thread(new ThreadB(myObject),"B").start();
	}
	
}

