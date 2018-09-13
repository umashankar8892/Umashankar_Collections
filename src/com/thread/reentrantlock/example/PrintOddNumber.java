package com.thread.reentrantlock.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddNumber extends Thread{

	private String threadName;
	private Lock lock;
	
	public PrintOddNumber(String threadName) {
		this.threadName = threadName;
		this.lock = new ReentrantLock();
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(lock.tryLock()) {
			if(i%2==1)
				System.out.println(Thread.currentThread().getName() +" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lock.unlock();
			}
			
			if(lock.tryLock()) {
				if(i%2==0)
					System.out.println(Thread.currentThread().getName() +" "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.unlock();
			}
		}
	}
}
