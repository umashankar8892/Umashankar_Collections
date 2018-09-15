package com.thread.reentrantlock.example;

import java.util.concurrent.locks.Lock;

public class PrintEvenNumber extends Thread {

	private String threadName;
	private Lock lock;

	public PrintEvenNumber(String threadName, Lock lock) {
		this.threadName = threadName;
		this.lock = lock;
	}

	public void run() {
		lock.lock();
		System.out.println("Acquired lock on printEvenNumber");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		lock.unlock();

	}
}
