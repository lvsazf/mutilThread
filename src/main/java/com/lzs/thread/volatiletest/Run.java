package com.lzs.thread.volatiletest;

/**
 * 理解volatile的一个好方法是把对volatile变量的单个读/写，看成是使用同一个锁对这些单个读/写做了同步
 * @author lzs
 * 2017年7月9日上午11:32:54
 */
public class Run {

	/**
	 * volatile特性：
	 * 可见性：对一个volatile的读，总能看到对这个volatile变量的写入
	 * 原子性：对单个volatile的读/写，具有原子性，但不包括volatile++这样的复合操作
	 * 从内存语义来说，vloatile的写和锁的释放有相同的内存语义，vloatile的读和锁的获取有相同的内存语义
	 * volatile的写-读内存语义：
	 * volatile的写内存语义
	 * 当写一个volatile变量时，JMM会把该线程对应的本地内存中的共享变量值刷新到主内存中
	 * volatile的读内存语义
	 * 当读一个volatile变量时，JMM会把该线程对应的本地内存值设为无效，重新从主内存中获取共享变量
	 * 总结：
	 * 线程A写一个volatile变量，实质上是线程A向接下来将要读这个volatile变量的线程发出了消息
	 * 线程B读一个volatile变量，实质上是线程B接收到了之前某个写线程发出的消息
	 * 线程A写一个volatile变量，随后线程B读这个volatile变量，实质上是线程A通过主内存向线程B发出了消息
	 * @param args
	 */
	public static void main(String[] args) {
		VolatileFetureExample num = new VolatileFetureExample();
		new Thread(() -> {num.getAndIncrement();}).start();
		new Thread(() -> {System.out.println(num.get());}).start();
		

	}

}
