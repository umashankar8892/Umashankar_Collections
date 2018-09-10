package com.lists.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("Example1");
		stringList.add("Example2");
		stringList.add("Example3");
		
		stringList.forEach(example -> {
			System.out.println(example);
		});
		
		System.out.print(stringList.toString());
	}
}
