package com.thread.examples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer extends Thread{

	private List<String> listString;
	private int SIZE;
	private Lock lock;
	
	public Consumer(List<String> listString,int size) {
		this.listString = listString;
		this.SIZE = size;
		this.lock = new ReentrantLock();
	}
	
	public void run() {
		System.out.println("CONSUMER: Acquiring lock");
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)) {
				while(true) {
				if(listString.size()==0) {
					System.out.println("CONSUMER: Waiting for producer to produce the item");
					try {
						listString.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(String str : listString) {
					System.out.println("Consumed "+str);
				}
				System.out.println("CONSUMER: Clearing items consumed");
				this.listString.clear();
				System.out.println("CONSUMER: List size is "+listString.size());
				System.out.println("CONSUMER: Notifying waiting threads");
				listString.notify();
			}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
