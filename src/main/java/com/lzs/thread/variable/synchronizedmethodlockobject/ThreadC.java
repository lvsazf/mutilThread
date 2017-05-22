package com.lzs.thread.variable.synchronizedmethodlockobject;

/**
 * 测试synchronized锁重入
 * 当一个线程得到一个对象锁之后，再次请求该对象是能获取到该对象锁的
 * 
 * @author lzs
 *
 */
public class ThreadC implements Runnable {

	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
