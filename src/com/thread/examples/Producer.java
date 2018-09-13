package com.thread.examples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer extends Thread {

	private List<String> listString;
	private int SIZE;
	private Lock lock;

	public Producer(List<String> listString, int size) {
		this.listString = listString;
		this.SIZE = size;
		this.lock = new ReentrantLock();
	}

	public void run() {
		System.out.println("PRODUCER: Acquiring lock");
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)) {
				while (true) {
					if (listString.size() == SIZE) {
						System.out.println("PRODUCER: List is full.. Waiting for consumer to consume the items");
						try {
							listString.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("PRODUCER: Producing Example3");
						listString.add("Example3");
						listString.notify();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
