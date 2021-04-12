package com.hcl.concurencey;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UsingConcurrenthmap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> cm=new ConcurrentHashMap<>();
		cm.put("aa", 1);
		cm.put("bb", 2);
		cm.put("cc", 3);
		cm.put("dd", 4);
		
		Iterator<Map.Entry<String, Integer>> itr=cm.entrySet().iterator();
		
		while (itr.hasNext()) {
			  Map.Entry<String, Integer> pair = itr.next();
			  
			  System.out.println(pair.getKey()+" : "+pair.getValue());
			  
			 cm.put("ee", 5);
		}

	}

}
