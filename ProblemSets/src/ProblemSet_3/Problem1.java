package ProblemSet_3;

public class Problem1 {
	public String getAllSubstrings(String s) {
		String allsubstring="";
		for(int i=0;i<=s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				allsubstring+=s.substring(i, j)+" ";
			}
		}
		return allsubstring;
	}
	public static void main(String[]args) {
		String s="Apple";
		System.out.println(new Problem1().getAllSubstrings(s));
		
	}

}
