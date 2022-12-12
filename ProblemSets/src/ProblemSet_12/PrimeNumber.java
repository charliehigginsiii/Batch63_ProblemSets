package ProblemSet_12;

public class PrimeNumber {
	public boolean isPrime(int n) {
		boolean prime=true;
		for(int i=0;i<n;i++) {
			if(i!=0&&i!=1&&i!=n&&n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	public static void main(String[]args) {
		int n=9;
		System.out.println("Is this number prime? "+new PrimeNumber().isPrime(n));
		
	}

}
