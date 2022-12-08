package ProblemSet_11;

public class StringReversal {
	public String reverseString(String s) {
		String reversedString="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedString+=s.charAt(i)+"";
		}
		return reversedString;
	}
	public static void main(String[]args) {
		String s="Apple";
		s=new StringReversal().reverseString(s);
		System.out.println(s);
	}

}
