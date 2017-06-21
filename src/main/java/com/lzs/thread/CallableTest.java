package com.lzs.thread;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "this is a test";
	}
	
}
