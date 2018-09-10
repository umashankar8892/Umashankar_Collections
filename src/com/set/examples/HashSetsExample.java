package com.set.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetsExample {

	public static void main(String args[]) {
		
		Set<String> set = new HashSet<String>();
		set.add("Example1");
		set.add("Example1");
		
		System.out.println(set.toString());
	}
}
