package com.thread.countdownlatch.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddNumber extends Thread{

	private String threadName;
	private CountDownLatch latch;
	
	public PrintOddNumber(String threadName,CountDownLatch latch) {
		this.threadName = threadName;
		this.latch = latch;
	}
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				if(i%2==1)
					System.out.println("Thread "+threadName +" "+i);
			}
			latch.countDown();
		}catch(Exception ex) {
			
		}
	}
}
