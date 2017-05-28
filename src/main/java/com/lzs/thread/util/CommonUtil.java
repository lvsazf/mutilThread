package com.lzs.thread.util;

public class CommonUtil {
	
	public static void intoPrint(){
		System.out.println("线程" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
	}
	public static void outPrint(){
		System.out.println("线程" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
	}
	
}
