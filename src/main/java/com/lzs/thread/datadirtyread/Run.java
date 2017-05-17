package com.lzs.thread.datadirtyread;

public class Run {
	
	public static int count = 0;
	
	/**
	 * <p>MethodName: main</p>
	 * <p>Description: 解决数据脏读就是给取值方法添加上synchronized</p>
	 * @param args
	 * @Date 2017年5月16日下午10:18:31
	 * @author luzs
	 */
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			Thread thread = new Thread(new ThreadA(publicVar));
			thread.start();
			Thread.sleep(1000);
			publicVar.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
