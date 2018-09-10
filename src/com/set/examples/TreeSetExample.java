package com.set.examples;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String args[]) {
		TreeSet<String> al = new TreeSet<String>(); // creating treeSet
		al.add("John"); // adding elements
		al.add("Sam");
		al.add("Rick");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
