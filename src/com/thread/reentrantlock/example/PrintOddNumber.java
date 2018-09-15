package com.thread.reentrantlock.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddNumber extends Thread {

	private String threadName;
	private Lock lock;

	public PrintOddNumber(String threadName, Lock lock) {
		this.threadName = threadName;
		this.lock = lock;
	}

	public void run() {
		System.out.println("Running PrintOddNumber task");
		lock.lock();
		System.out.println("Acquired lock on PrintOddNumber");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}
		lock.unlock();
	}
}
