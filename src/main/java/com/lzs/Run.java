package com.lzs;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author Administrator
 * 2017年6月3日上午11:11:28
 */
public class Run {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		try {
			
		} finally {
			lock.unlock();
		}
	}
}
