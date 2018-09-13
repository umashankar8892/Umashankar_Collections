package com.set.examples;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String args[]) {
		SortedSet<String> sites = new TreeSet<String>(); // creating treeSet
		sites.add("practice"); 
        sites.add("geeksforgeeks"); 
        sites.add("quiz"); 
        sites.add("code");
        sites.add("ajitha");
        
		Iterator<String> itr = sites.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
