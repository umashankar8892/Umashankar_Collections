package com.thread.threadPoolExecutor.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		List<Future<String>> futures =new ArrayList<Future<String>>(10);
		
		for(int i=0;i<10;i++) {
			futures.add(pool.submit(new StringTask()));
		}
		
		for(Future<String> future : futures) {
			String result = (String)future.get();
			System.out.println(result);
		}
		pool.shutdown();
	}
}
