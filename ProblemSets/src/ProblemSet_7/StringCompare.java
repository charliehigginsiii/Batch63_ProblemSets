package ProblemSet_7;

public class StringCompare {
	public boolean compareStrings(String s1,String s2) {
		return s1.equals(s2);
	}
	public static void main(String[]args) {
		String s1="String";
		String s2="String";
		System.out.println(new StringCompare().compareStrings(s1, s2));
	}

}
