package com.set.examples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String args[]) {
		Set<String> al = new LinkedHashSet<String>();
		al.add("Mariana");
		al.add("Rick");
		al.add("Sam");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
