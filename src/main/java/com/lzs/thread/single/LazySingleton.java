package com.lzs.thread.single;

/**
 *懒汉单例模式（延迟加载模式）
 *使用于单线程环境，多线程下必须加同步来保证
 *优点：资源利用率高
 *缺点：第一次加载的时候反应不快，多线程使用不必要的同步开销大
 * @author lzs
 * 2017年5月25日下午10:21:20
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	public LazySingleton() {
		System.out.println("LazySingleton's constructor is ok");
	}
	
	public static LazySingleton getInstance(){
		if(instance == null)
			instance = new LazySingleton();
		return instance;
	}
	
	
}
