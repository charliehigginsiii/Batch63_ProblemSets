package ProblemSet_3;

public class Problem3 {
	public boolean IsPalindrome(int number) {
		String numberstring=Integer.toString(number);
		String reversedstring="";
		Boolean palindrome=false;
		for(int i=numberstring.length()-1;i>=0;i--) {
			reversedstring+=numberstring.charAt(i);
		}
		if(numberstring.equals(reversedstring)) {
			palindrome=true;
		}
		return palindrome;
	}
	public static void main(String[]args) {
		int number=12325;
		System.out.println(new Problem3().IsPalindrome(number));
	}

}
