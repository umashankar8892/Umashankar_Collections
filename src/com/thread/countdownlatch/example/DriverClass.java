package com.thread.countdownlatch.example;

import java.util.concurrent.CountDownLatch;

public class DriverClass {
	public static void main(String args[]) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(1);
		PrintEvenNumber pen = new PrintEvenNumber("Even Thread",latch);
		PrintOddNumber pon = new PrintOddNumber("Odd Thread",latch);
		pen.start();
		latch.await();
		pon.start();
	}
}
