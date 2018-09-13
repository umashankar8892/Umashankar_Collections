package com.thread.reentrantlock.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DriverClass {
	public static void main(String args[]) {
		Lock lock = new ReentrantLock();
		PrintEvenNumber pen = new PrintEvenNumber("Thread1",lock);
		PrintEvenNumber pen1 = new PrintEvenNumber("Thread2",lock);
		PrintEvenNumber pen3 = new PrintEvenNumber("Thread3",lock);
		
		pen.start();
		pen1.start();
		pen3.start();
	}
}
