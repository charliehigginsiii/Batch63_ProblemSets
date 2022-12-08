package ProblemSet_11;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {
	public static void main(String[]args) {
		HashMap<String,Long> countrypopulations=new HashMap<>();
		countrypopulations.put("United States of America", 332000000L);
		countrypopulations.put("Nigeria", 217000000L);
		countrypopulations.put("Brazil", 215000000L);
		countrypopulations.put("China", 1440000000L);
		Iterator iterater=countrypopulations.entrySet().iterator();
		while(iterater.hasNext()) {
			System.out.println(iterater.next());
		}
		System.out.println();
		for(String nation: countrypopulations.keySet()) {
			System.out.println(countrypopulations.get(nation));
		}
	}

}
