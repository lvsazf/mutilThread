package com.lzs.thread.variable.synchronizedmethodlockobject;

public class SubExtend extends Sub {
	
	public synchronized void childMethod(){
		while (num > 0) {
			try {
				num--;
				System.out.println("child-num" + num);
				Thread.sleep(1000);
				this.operateMainMethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
