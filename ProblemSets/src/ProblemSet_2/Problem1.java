package ProblemSet_2;

public class Problem1 {
	public String RemoveOccurance(String s,char c) {
		String newString="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				newString=s.replaceAll(s.charAt(i)+"", "");
			}
			
		}
		return newString;
	}
	public static void main(String[]args) {
		String s="Apple Jacks";
		s=new Problem1().RemoveOccurance(s, 'p');
		System.out.println(s);
	}
}
