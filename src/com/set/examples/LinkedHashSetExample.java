package com.set.examples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class LinkedHashSetExample {

	public static void main(String args[]) {
		Set<String> al = new LinkedHashSet<String>();
		al.add("Mariana");
		al.add("Rick");
		al.add("Sam");
		al.add("Ajita");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
