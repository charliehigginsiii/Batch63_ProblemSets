package ProblemSet_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class Problem6 {
	public LinkedHashMap sortHashmap(HashMap hashmap) {
		LinkedHashMap orderedmap=new LinkedHashMap();
		ArrayList list=new ArrayList(hashmap.values());
		for(int i=0;i<list.size();i++) {
			for(Object key:hashmap.keySet()) {
				if(hashmap.get(key)==list.get(i)) {
					orderedmap.put(key, list.get(i));
				}
			}
		}
		return orderedmap;
	}
	public static void main(String[]args) {
		HashMap hashmap=new HashMap();
		hashmap.put("Random1", 4);
		hashmap.put("Random2", 1);
		hashmap.put("Random3", 19);
		hashmap.put("Random4", 2);
		LinkedHashMap orderedmap=new Problem6().sortHashmap(hashmap);
		Iterator iterate=orderedmap.entrySet().iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
	}

}
