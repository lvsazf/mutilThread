package com.lzs.thread.single;

/**
 *恶汉单例模式
 *优点：线程安全，调用时反应速度快，在类加载的同时已经加载好了一个静态对象
 *缺点：资源利用率不高，可能该实例并不需要，在一些场景下无法使用，
 *比如Single的实例的创建依赖参数或配置文件，则在instance()之前必须调用某一方法来设置这些参数，但在设置前，已经创建该实例
 * @author lzs
 * 2017年5月25日下午10:15:13
 */
public class Single {

	public Single() {
		super();
		System.out.println("constructor is ok");
	}
	
	private static Single single = new Single();
	
	public static Single instance(){
		return single;
	}

}
