package ProblemSet_14;

public class PowerwithoutPOW {
	public int getPOW(int n1,int n2) {
		int power=1;
		for(int i=1;i<=n2;i++) {
			power*=n1;
		}
		return power;
	}
	public static void main(String[]args) {
		int n1=5;
		int n2=3;
		System.out.println("Result: "+new PowerwithoutPOW().getPOW(n1, n2));
	}

}
