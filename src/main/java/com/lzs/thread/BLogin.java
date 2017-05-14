package com.lzs.thread;

public class BLogin extends Thread{
	@Override
	public void run() {
		LoginServlet.doPost("b", "bbb");
	}
}
