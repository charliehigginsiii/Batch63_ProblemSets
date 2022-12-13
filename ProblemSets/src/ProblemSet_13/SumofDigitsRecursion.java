package ProblemSet_13;

public class SumofDigitsRecursion {
	public int sum(int n) {
		if(n==0) 
			return n;
		return (n%10+sum(n/10));
		
	}
	public static void main(String[]args) {
		int n=19834;
		System.out.println("Sum: "+new SumofDigitsRecursion().sum(n));
	}
}
