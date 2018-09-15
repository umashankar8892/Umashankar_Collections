package com.thread.reentrantlock.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DriverClass {
	public static void main(String args[]) {
		Lock lock = new ReentrantLock();
		PrintEvenNumber pen = new PrintEvenNumber("Thread1",lock);
		PrintOddNumber pon = new PrintOddNumber("Thread2", lock);
		pon.start();
		pen.start();
		
	}
}
