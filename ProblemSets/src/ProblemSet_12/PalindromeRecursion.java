package ProblemSet_12;

public class PalindromeRecursion {
	public int isPalindrome(int n,int tempnum) {
		if(n==0) 
			return tempnum;
		tempnum=(tempnum*10)+(n%10);
		return isPalindrome(n/10,tempnum);
		
	}
	public static void main(String[]args) {
		int n=12321;
		if(new PalindromeRecursion().isPalindrome(n,0)==n) {
			System.out.println("Number is a palindrome.");
		}else {
			System.out.println("Number is not a palindrome.");
		}
	}

}
