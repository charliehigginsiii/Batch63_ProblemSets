package ProblemSet_14;

public class FactorialRecursion {
	public int factorial(int n) {
		if(n<=0) 
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[]args) {
		int n=5;
		System.out.println("Factorial: "+new FactorialRecursion().factorial(n));
	}

}
