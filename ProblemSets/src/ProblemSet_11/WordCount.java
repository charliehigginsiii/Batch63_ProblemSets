package ProblemSet_11;

import java.util.HashMap;

public class WordCount {
	public HashMap<String,Integer> countWords(String s) {
		HashMap<String, Integer> wordmap=new HashMap<>();
		String[]arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			wordmap.put(arr[i], i+1);
		}
		return wordmap;
	}
	public static void main(String[]args) {
		String s="The rabit ate the carrot";
		System.out.println(new WordCount().countWords(s).size());
	}

}
