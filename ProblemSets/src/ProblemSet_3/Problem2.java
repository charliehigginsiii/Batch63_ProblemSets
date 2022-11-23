package ProblemSet_3;

public class Problem2 {
	public String reverse(String s) {
		String reversedstring="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedstring+=s.charAt(i);
		}
		return reversedstring;
	}
	public static void main(String[]args) {
		String s="Apple";
		System.out.println(new Problem2().reverse(s));
	}

}
