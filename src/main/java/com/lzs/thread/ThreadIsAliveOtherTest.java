package com.lzs.thread;

public class ThreadIsAliveOtherTest extends Thread{
	public ThreadIsAliveOtherTest() {
		System.out.println("ThreadIsAliveOtherTest--begin");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("ThreadIsAliveOtherTest--end");
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run--begin");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("run--end");
	}
	
}
