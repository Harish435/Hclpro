package com.hcl.concurencey;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_Exception {

	public static void main(String[] args) {

		HashMap<String, Integer> m =new HashMap<>();
		m.put("aa", 1);
		m.put("bb", 2);
		m.put("cc", 3);
		m.put("dd", 4);
		
		Iterator<Map.Entry<String, Integer>> itr=m.entrySet().iterator();
	
		while (itr.hasNext()) {
			  Map.Entry<String, Integer> pair = itr.next();
			  
			  System.out.println(pair.getKey()+" : "+pair.getValue());
			  
			  m.put("ee", 5); //Will get exception
		}
		
		
	}

}
