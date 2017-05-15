package com.lzs.thread.variableconcurrent;

public class HasSelfPrivateNum {
	private Integer num = 0;
	
	synchronized public void setNum(String username){
		try {
			Integer i = 0;
			if("a".equals(username)){
				i = 100;
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			}else {
				i = 200;
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + "i: " + i + "num: " + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
