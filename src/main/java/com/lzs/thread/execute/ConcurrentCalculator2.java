package com.lzs.thread.execute;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.lzs.thread.execute.CalculatorArr.SumCalculator;

public class ConcurrentCalculator2 {
	
	private ExecutorService service;
	private CompletionService<Long> completionService;
	private int cpuCoreNumber;
	
	class SumCalculator implements Callable<Long> {
		private int[] numbers;
		private int begin;
		private int end;

		public SumCalculator(final int[] numbers, int begin, int end) {
			super();
			this.numbers = numbers;
			this.begin = begin;
			this.end = end;
		}

		@Override
		public Long call() throws Exception {
			Long sum = 0L;
			for (int i = begin; i < end; i++) {
				sum += numbers[i];
			}
			return sum;
		}
	}
	
	public ConcurrentCalculator2() {
		super();
		cpuCoreNumber = Runtime.getRuntime().availableProcessors();
		service = Executors.newFixedThreadPool(cpuCoreNumber);
		completionService = new ExecutorCompletionService<>(service);
	}
	
	public void sum(final int[] nums){
		for (int i = 0; i < cpuCoreNumber; i++) {
			int increment = nums.length/cpuCoreNumber + 1;
			int start = increment * i;
			int end = increment * i + increment;
			if(end > nums.length)
				end = nums.length;
			SumCalculator sumCalculator = new SumCalculator(nums, start, end);
			
			if (!service.isShutdown()) {
				service.submit(sumCalculator);
			}
		}
//		return getResult();
	}
	
	public Long getResult(){
		Long result = 0L;
		for(int i = 0;i< cpuCoreNumber;i++){
			Long long1;
			try {
				long1 = completionService.take().get();
				result += long1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public void close(){
		service.shutdown();
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
		Long beginTime = System.currentTimeMillis();
		CalculatorArr calculatorArr = new CalculatorArr();
		calculatorArr.sum(nums);
		calculatorArr.close();
		System.out.println(calculatorArr.getResult());
//		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	
}
