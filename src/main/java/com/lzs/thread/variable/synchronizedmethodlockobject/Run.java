package com.lzs.thread.variable.synchronizedmethodlockobject;

public class Run {
	public static void main(String[] args) {
		new Thread(new ThreadC()).start();
	}
}
