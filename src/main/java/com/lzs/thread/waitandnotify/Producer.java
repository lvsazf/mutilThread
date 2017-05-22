package com.lzs.thread.waitandnotify;

public class Producer implements Runnable {

	private Info info = null;
	
	public Producer(Info info) {
		this.info = info;
	}
	
	@Override
	public void run() {
		boolean flag = true;
		for (int i = 0; i < 10; i++) {
			if(flag){
				info.set("a", "aa");
				flag = false;
			}else{
				info.set("b", "bb");
				flag = true;
			}
		}
	}

}
