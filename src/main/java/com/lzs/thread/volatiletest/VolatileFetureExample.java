package com.lzs.thread.volatiletest;

public class VolatileFetureExample {
	
	volatile long v1 = 0L; //使用volatile声明一个64位的long变量
	
	public void set(long l){
		v1 = l;
	}
	
	public void getAndIncrement(){
		v1++;
	}
	
	public long get(){
		return v1;
	}
	
}
