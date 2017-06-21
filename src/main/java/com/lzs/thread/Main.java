package com.lzs.thread;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String call = new CallableTest().call();
		System.out.println(call);
		
	}

	/**
	 * 线程运行存在随机性 Administrator
	 *  下午8:38:56
	 */
	public static void randomThread() {
		MyThread m1 = new MyThread("m1");
		MyThread m2 = new MyThread("m2");
		m1.start();
		m2.start();
	}

	/**
	 * 共享同一变量，加synchronized是为了解决非线程安全问题 
	 * Administrator
	 * 下午8:40:35
	 */
	public static void testSynchronized() {

		// MyRunnable my = new MyRunnable();
		// new Thread(my,"A").start();
		// new Thread(my,"B").start();
		// new Thread(my,"C").start();
		// new Thread(my,"D").start();
		// new Thread(my,"E").start();
		ALogin aLogin = new ALogin();
		BLogin bLogin = new BLogin();
		aLogin.start();
		bLogin.start();
	}

	public static void currentThreadExt() {
		CountOperate countOperate = new CountOperate();
		countOperate.setName("A");
		countOperate.start();
	}

	/**
	 * 判断当前线程是否处于活动状态,活动状态就是线程已经启动尚未结束， 
	 * 线程处于正在运行或准备开始运行的状态，就认为线程是 “存活”的
	 * Administrator 下午9:14:50
	 */
	public static void isAlive() {
		ThreadAlive threadAlive = new ThreadAlive();
		System.out.println("begin=" + threadAlive.isAlive());
		threadAlive.start();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end=" + threadAlive.isAlive());//该值不确定
	}

	/**
	 * 判断当前线程是否出于活动状态
	 *Administrator
	 *下午9:26:59
	 */
	public static void threadIsAliveOtherTest() {
		ThreadIsAliveOtherTest threadIsAliveOtherTest = new ThreadIsAliveOtherTest();
		System.out.println("main begin threadIsAliveOtherTest-- isAlive = " + threadIsAliveOtherTest.isAlive());
		threadIsAliveOtherTest.start();
		System.out.println("main end threadIsAliveOtherTest-- isAlive = " + threadIsAliveOtherTest.isAlive());

	}

	/**
	 * 测试在沉睡中被停止，会进入catch语句，并清除停止状态，使之变成false
	 *Administrator
	 *下午10:58:51
	 */
	public static void threadInterruptTest() {
		ThreadInterruptTest threadInterruptTest = new ThreadInterruptTest();
		threadInterruptTest.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadInterruptTest.interrupt();
		//		System.out.println("a1" + Thread.interrupted());//测试当前线程是否已经是中断状态， 执行后具有将状态标志置清除为 false 的功能
		//		System.out.println("a2" + Thread.interrupted());
		//		System.out.println("aa1" + threadInterruptTest.isInterrupted());//测试线程Thread 对象是否已经 是中断状态，但不清除状态标志
		//		System.out.println("aa2" + threadInterruptTest.isInterrupted());
	}

	/**
	 * 暴力停止
	 *Administrator
	 *下午11:06:15
	 */
	@SuppressWarnings("deprecation")
	public static void useStopMethodThreadTest() {
		UseStopMethodThreadTest useStopMethodThreadTest = new UseStopMethodThreadTest();
		useStopMethodThreadTest.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		useStopMethodThreadTest.stop();
	}

	public static void runMethodUseStopMethod() {
		RunMethodUseStopMethod runMethodUseStopMethod = new RunMethodUseStopMethod();
		runMethodUseStopMethod.start();
	}

	/**
	 * <p>MethodName: stopThreadLock</p>
	 * <p>Description: 使用stop释放会给数据造成不一致性的结果</p>
	 * @Date 2017年5月15日下午2:14:56
	 * @author luzs
	 */
	public static void stopThreadLock() {

		SynchronizedObject object = new SynchronizedObject();
		StopThreadLock stopThreadLock = new StopThreadLock(object);
		stopThreadLock.start();
		try {
			Thread.sleep(500);
			stopThreadLock.stop();
			System.out.println(object.getUsername() + object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void useReturnInterrupt() {
		UseReturnInterrupt useReturnInterrupt = new UseReturnInterrupt();
		try {
			useReturnInterrupt.start();
			Thread.sleep(500);
			useReturnInterrupt.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void suspendResumeTest() {
		try {
			SuspendResumeTest test = new SuspendResumeTest();
			test.start();
			Thread.sleep(5000);
			test.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + test.getI());
			Thread.sleep(5000);
			System.out.println("A= " + System.currentTimeMillis() + " i=" + test.getI());
			test.resume();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + test.getI());
			test.sleep(5000);
			test.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + test.getI());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void suspendResumeDealLock() {
		final SuspendResumeDealLock object = new SuspendResumeDealLock();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				super.run();
				object.printString();
			}
		};

		thread1.setName("a");
		thread1.start();
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				super.run();
				System.out.println("thread2启动了，但进不了print方法");
				object.printString();
			}
		};
		thread2.start();
	}

	/**
	 * <p>MethodName: yieldTest</p>
	 * <p>Description: 放弃当前的CPU 资源，将它让给其他的任务去占用CPU 执行时 间。但放弃的时间不确定，有可能刚刚放弃，马上又获得 CPU 时间片。 </p>
	 * @Date 2017年5月15日下午2:59:05
	 * @author luzs
	 */
	public static void yieldTest() {
		YieldTest yieldTest = new YieldTest();
		yieldTest.start();
	}

}
