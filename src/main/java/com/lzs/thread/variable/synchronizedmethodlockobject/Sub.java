package com.lzs.thread.variable.synchronizedmethodlockobject;

public class Sub {
	
	public int num = 10;
	
	public synchronized void operateMainMethod() {
		try {
			num--;
			System.out.println("operateMainMethod：-num=" + num);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
