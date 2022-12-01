package ProblemSet_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SortedHashMap {
	public LinkedHashMap sortHashMap(HashMap<String,Integer> map) {
		LinkedHashMap<String,Integer> sortedmap=new LinkedHashMap<>();
		ArrayList<Integer> arrayofvalues=new ArrayList<>();
		Iterator iterate=map.entrySet().iterator();
		for(String key: map.keySet()) {
			arrayofvalues.add(map.get(key));
		}
		Collections.sort(arrayofvalues);
		for(int i=0;i<arrayofvalues.size();i++) {
			for(String key: map.keySet()) {
				if(arrayofvalues.get(i)==map.get(key)) {
					sortedmap.put(key,arrayofvalues.get(i) );
				}
			}
		}
		return sortedmap;
	}
	public static void main(String[]args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("One", 5);
		map.put("Two", 9);
		map.put("Three", 14);
		map.put("Four", 12);
		map.put("Five", 7);
		map.put("Six", 90);
		LinkedHashMap<String,Integer> sortedmap=new SortedHashMap().sortHashMap(map);
		Iterator iterates=map.entrySet().iterator();
		while(iterates.hasNext()) {
			System.out.println(iterates.next());
		}
		System.out.println();
		Iterator iterate=sortedmap.entrySet().iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

}
