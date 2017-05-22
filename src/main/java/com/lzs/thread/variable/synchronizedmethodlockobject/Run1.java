package com.lzs.thread.variable.synchronizedmethodlockobject;

/**
 * 锁重入支持在父子继承中
 * @author lzs
 *
 */
public class Run1 {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				SubExtend extend = new SubExtend();
				extend.childMethod();
				
			}
		}).start();
	}
	
}
