package com.lists.examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String args[]) {
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Example1");
		linkedList.add("Example2");
		linkedList.add("Example3");
		
		linkedList.forEach(element -> {
			System.out.println(element);
		});
	}
}
