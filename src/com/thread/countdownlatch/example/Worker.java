package com.thread.countdownlatch.example;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{

	private int delay;
	private CountDownLatch latch;
	
	public Worker(int delay,CountDownLatch latch,String name) {
		super(name);
		this.delay=delay;
		this.latch=latch;
	}
	
	public void run() {
		try{
			System.out.println(Thread.currentThread().getName() + " started");
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " finished");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
