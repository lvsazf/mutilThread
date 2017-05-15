package com.lzs.thread.variableconcurrent;

public class Main {
	
	public static void main(String[] args) {
		twoObjectTwoLock();
	}
	
	/**
	 * <p>MethodName: privateNum</p>
	 * <p>Description: 对方法内的变量，不存在非线程安全问题,成员变量存在非线程安全问题，只需要在该方法前加synchronized即可</p>
	 * @Date 2017年5月15日下午3:49:57
	 * @author luzs
	 */
	private static void privateNum() {
		HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(hasSelfPrivateNum );
		ThreadB threadB = new ThreadB(hasSelfPrivateNum);
		threadA.start();
		threadB.start();
	}
	
	private static void twoObjectTwoLock() {
		HasSelfPrivateNum numObject1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numObject2 = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(numObject1);
		threadA.start();
		ThreadB threadB = new ThreadB(numObject2);
		threadB.start();
	}
	
}
