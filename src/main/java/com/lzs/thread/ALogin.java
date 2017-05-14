package com.lzs.thread;

public class ALogin extends Thread{
	@Override
	public void run() {
		LoginServlet.doPost("a", "aaa");
	}
}
