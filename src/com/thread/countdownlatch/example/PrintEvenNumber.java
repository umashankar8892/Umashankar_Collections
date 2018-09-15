package com.thread.countdownlatch.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenNumber extends Thread{

	private String threadName;
	private CountDownLatch latch;

	public PrintEvenNumber(String threadName,CountDownLatch latch) {
		this.threadName = threadName;
		this.latch = latch;
	}

	public void run() {
			System.out.println("Thread "+threadName + " is executing");
			
			for(int i=0;i<10;i++) {
				if(i%2==0)
					System.out.println("Thread "+threadName +" "+i);
			}
			latch.countDown();
	}
}
