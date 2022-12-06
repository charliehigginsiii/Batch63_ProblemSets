package ProblemSet_9;

import java.util.HashMap;

public class ValueRetrieval {
	public long getValue(HashMap<String,Long> hashmap, String country) {
		long population=0;
		for(String nation:hashmap.keySet()) {
			if(nation.equals(country)) {
				population=hashmap.get(nation);
			}
		}
		return population;
	}
	public static void main(String[]args) {
		HashMap<String,Long> countryPopulations=new HashMap<String,Long>();
		countryPopulations.put("Nigeria", 217000000L);
		countryPopulations.put("India", 1340000000L);
		countryPopulations.put("United States", 332000000L);
		countryPopulations.put("China", 1420000000L);
		System.out.println(countryPopulations);
		String nation="India";
		System.out.println("India's Population: "+new ValueRetrieval().getValue(countryPopulations, "India"));
	}

}
