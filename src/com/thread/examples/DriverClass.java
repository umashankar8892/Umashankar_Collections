package com.thread.examples;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("Name1");
		//stringList.add("Name2");
		
		Producer producer = new Producer(stringList, 5);
		Consumer consumer = new Consumer(stringList, 5);
		producer.start();
		consumer.start();
	}
}
