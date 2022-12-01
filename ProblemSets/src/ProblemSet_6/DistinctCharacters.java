package ProblemSet_6;

import java.util.HashMap;

public class DistinctCharacters {
	public HashMap<Character,Integer> getDistinctCharacters(String s) {
		int count=0;
		String accumulator="";
		HashMap<Character,Integer> charactersMap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(accumulator.contains(s.charAt(i)+"")) {
				continue;
			}else {
				accumulator+=s.charAt(i)+"";
			}
		}
		System.out.println(accumulator);
		for(int i=0;i<accumulator.length();i++) {
			count=0;
			for(int j=0;j<s.length();j++) {
				System.out.println(accumulator.charAt(i)+" "+s.charAt(i));
				if(accumulator.charAt(i)==s.charAt(j)) {
					count=count+1;
				}
			}
			charactersMap.put(accumulator.charAt(i), count);
		}
		return charactersMap;
	}
	public static void main(String[]args) {
		String s="Hello";
		HashMap<Character,Integer> charactersMap=new DistinctCharacters().getDistinctCharacters(s);
		System.out.println(charactersMap);
	}

}
