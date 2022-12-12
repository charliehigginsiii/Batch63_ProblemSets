package ProblemSet_12;

public class FibonacciIteration {
	public int fibonacci(int n) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=n;++i) {
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return n1;
	}
	public static void main(String[]args) {
		int n=5;
		System.out.println(new FibonacciIteration().fibonacci(n));
	}

}
