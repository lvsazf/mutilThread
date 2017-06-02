package com.lzs.thread.execute;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<String>> resultList = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			Future<String> future = executorService.submit(new TaskWithResult(i));
			resultList.add(future);
		}
		for (Future<String> future : resultList) {
			try {
				while (!future.isDone()) 
					;
					System.out.println(future.get());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}finally {
				executorService.shutdown();
			}
		}

	}

}
