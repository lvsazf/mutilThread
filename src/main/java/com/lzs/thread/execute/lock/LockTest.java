package com.lzs.thread.execute.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	private List<Integer> list = new ArrayList<>();
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		LockTest lockTest = new LockTest();
//		lockMethod(lockTest);
		tryLockMethod(lockTest);
	}
	
	public void lockInterruptiblyInsert() throws InterruptedException{
		lock.lockInterruptibly();
		try {
			System.out.println("线程"+Thread.currentThread().getName() + "获得了锁！");
			TimeUnit.SECONDS.sleep(10);
		} finally {
			// TODO: handle finally clause
		}
	}
	
	public static void tryLockMethod(LockTest lockTest) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					lockTest.tryLockInsert();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}, "ThreadA").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					lockTest.tryLockInsert();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}, "ThreadB").start();
	}
	
	public void tryLockInsert() throws InterruptedException {
		if (lock.tryLock(5,TimeUnit.SECONDS)) {
			try {
				System.out.println(Thread.currentThread().getName() + "获得了锁");
				for (int i = 0; i < 7; i++) {
					list.add(i);
					Thread.sleep(1000);
				}
			} finally {
				// TODO: handle finally clause
				System.out.println(Thread.currentThread().getName() + "释放了锁");
				lock.unlock();
			}
		} else
			System.out.println(Thread.currentThread().getName() + "获取锁失败");
	}
	
	public static void lockMethod(LockTest lockTest){
		new Thread(new Runnable() {

			@Override
			public void run() {
				lockTest.lockInsert();

			}
		}, "ThreadA").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				lockTest.lockInsert();

			}
		}, "ThreadB").start();
	}
	
	public void lockInsert() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + "获得了锁");
			for (int i = 0; i < 5; i++) {
				list.add(i);
			}
		} finally {
			// TODO: handle finally clause
			System.out.println(Thread.currentThread().getName() + "释放了锁");
			lock.unlock();
		}

	}

}
