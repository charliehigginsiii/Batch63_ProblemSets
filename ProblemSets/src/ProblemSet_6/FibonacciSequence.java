package ProblemSet_6;

public class FibonacciSequence {
	public int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[]args) {
		int result=new FibonacciSequence().fibonacci(9);
		System.out.println("Result: "+result);
	}

}
