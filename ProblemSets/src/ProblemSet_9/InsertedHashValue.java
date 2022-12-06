package ProblemSet_9;

import java.util.HashMap;

public class InsertedHashValue {
	public static void main(String[]args) {
		HashMap<String,Integer> countryPopulations=new HashMap<String,Integer>();
		countryPopulations.putIfAbsent("Nigeria", 217000000);
		countryPopulations.putIfAbsent("Nigeria", 217000000);
		System.out.println(countryPopulations);
	}

}
