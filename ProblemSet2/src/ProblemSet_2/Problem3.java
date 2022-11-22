package ProblemSet_2;

public class Problem3 {
	public String RemoveWhiteSpace(String s) {
		String newString="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				newString=s.replaceAll(s.charAt(i)+"", "");
			}
			
		}
		return newString;
	}
	public static void main(String[]args) {
		String s="Apple    Jacks";
		s=new Problem3().RemoveWhiteSpace(s);
		System.out.println(s);
	}
}
