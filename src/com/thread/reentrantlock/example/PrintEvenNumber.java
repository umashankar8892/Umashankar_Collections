package com.thread.reentrantlock.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenNumber extends Thread{

	private String threadName;
	private Lock lock;

	public PrintEvenNumber(String threadName,Lock lock) {
		this.threadName = threadName;
		this.lock = lock;
	}

	public void run() {
		boolean lck = false;
		try {
			lck = lock.tryLock(3,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lck) {
			System.out.println("Acquired lock....");
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName() +" "+i);
			}
		}else {
			System.out.println("Unable to acquire lock... Waiting ");
		}
		lock.unlock();
	}
}
