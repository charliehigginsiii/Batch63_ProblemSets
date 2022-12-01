package ProblemSet_6;

public class ReversedString {
	public String reverseString(String s) {
		String newstring="";
		for(int i=s.length()-1;i>=0;i--) {
			newstring+=s.charAt(i);
		}
		return newstring;
	}
	public static void main(String[]args) {
		String s="Apple";
		s=new ReversedString().reverseString(s);
		System.out.println(s);
	}
	

}
