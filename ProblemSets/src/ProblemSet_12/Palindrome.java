package ProblemSet_12;

public class Palindrome {
	public boolean isPalindrome(int n) {
		boolean palindrome=false;
		String intString1=Integer.toString(n);
		String intString2="";
		for(int i=intString1.length()-1;i>=0;i--) {
			intString2+=String.valueOf(intString1.charAt(i))+"";
		}
		if(intString1.equals(intString2)) {
			palindrome=true;
		}
		return palindrome;
	}
	public static void main(String[]args) {
		int number=12321;
		System.out.println("Is integer palindrome? "+new Palindrome().isPalindrome(number));
	}

}
