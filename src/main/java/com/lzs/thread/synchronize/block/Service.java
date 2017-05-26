package com.lzs.thread.synchronize.block;

import com.lzs.thread.util.CommonUtil;

public class Service {
	
	private String username;
	private String password;
	private Byte[] lock = new Byte[]{0};//这里以byte{0}做为对象监听器，是因为编译后只有一行字节
	
	/**
	 * 
	 * 锁非this对象优点：如果一个类中有很多synchronized方法，synchronized (lock) 中的代码和同步方法是异步的，
	 * 不与其它锁this同步方法争夺this锁，则可以大大提高运行效率
	 * @param username
	 * @param password
	 *Administrator
	 *下午9:54:44
	 */
	public void setUsernmePassword(String username,String password){
		synchronized (lock) {
			CommonUtil.intoPrint();
			this.username = username;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.password = password;
			CommonUtil.outPrint();
		}
	}
	
}
