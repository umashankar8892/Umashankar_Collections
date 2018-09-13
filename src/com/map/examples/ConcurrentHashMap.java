package com.map.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap {

	public static void main(String args[]) {
		
		//Concurrent hashmap
		Map<String,String> concurrMap = new java.util.concurrent.ConcurrentHashMap<>();
		concurrMap.put("2", "1");
		concurrMap.put("3", "1");
		concurrMap.put("4", "1");
		concurrMap.put("5", "1");
		concurrMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+concurrMap);
		
		Iterator<String> it = concurrMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) concurrMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+concurrMap);

		
		//Normal hashmap
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "1");
		map.put("2", "1");
		map.put("3", "1");
		map.put("4", "1");
		map.put("5", "1");
		map.put("6", "1");
		System.out.println("HashMap before iterator: "+map);
		
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			if(key.equalsIgnoreCase("3")) {
				map.put(key, "new3");
			}
		}
		
		System.out.println("HashMap after iterator: "+map);
	}
}
