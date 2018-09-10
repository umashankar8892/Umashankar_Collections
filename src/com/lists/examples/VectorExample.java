package com.lists.examples;

import java.util.Vector;

public class VectorExample {

	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		vector.add("Example1");
		vector.add("Example2");
		vector.add("Example3");
		vector.add("Example4");
		
		System.out.println(vector.toString());
		
		vector.forEach(element -> {
			System.out.println(element);
		});
	}
}
