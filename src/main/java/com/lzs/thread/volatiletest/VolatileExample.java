package com.lzs.thread.volatiletest;

/**
 * 
 * 根据程序次序规则： 1 happens-before 2,2 happens-before 3,3 happens-before 4
 * 根据volatile规则:2 happens-before 3
 * 根据happens-before的传递原则：1 happens-before 4
 * 
 * @author lzs
 * 2017年7月9日下午12:05:33
 */
public class VolatileExample {
	
	int a = 0;
	volatile boolean flag = false;
	
	public void write(){
		a = 1;//1
		flag = true;//2
	}
	
	public void read(){
		if(flag)//3
			System.out.println(a);//4
	}
	
}
