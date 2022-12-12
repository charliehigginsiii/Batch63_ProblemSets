package ProblemSet_12;

public class FibonacciRecursion {
	public int fibonacci(int n) {
		if(n<=1) 
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}	
	public static void main(String []args) {
	int n=2;
	System.out.println(new FibonacciRecursion().fibonacci(n));
}

}
