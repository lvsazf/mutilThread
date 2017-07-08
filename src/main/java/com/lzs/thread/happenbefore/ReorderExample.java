package com.lzs.thread.happenbefore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReorderExample {
	Logger logger = LoggerFactory.getLogger(ReorderExample.class);
	int num = 0;
	boolean flag = false;

	public void writer() {
		num = 2;
		flag = true;
	}

	public void reader() {
		if (flag) {
			int i = num * num;
			if (i != 4) {
			}
			logger.info("the value is {}"+i);
//			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}

}
