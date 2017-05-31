package com.lzs.thread.execute;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 10; i++) {
			Future<Integer> future = service.submit(new MyTask(i));
			futures.add(future);
		}
		
		try {
			for (Future<Integer> future : futures) {
				while(!future.isDone());
				System.out.println(future.get() + "");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally {
			service.shutdown();
		}
		
	}

}

class MyTask implements Callable<Integer> {

	private Integer num;
	
	
	public MyTask(Integer num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		return num;
	}

}