package ProblemSet_9;

import java.util.HashMap;

public class AllValues {
	public static void main(String[]args) {
		HashMap<String,Long> countryPopulations=new HashMap<String,Long>();
		countryPopulations.put("Nigeria", 217000000L);
		countryPopulations.put("India", 1340000000L);
		countryPopulations.put("United States", 332000000L);
		countryPopulations.put("China", 1420000000L);
		System.out.println(countryPopulations.entrySet());
	}
}
