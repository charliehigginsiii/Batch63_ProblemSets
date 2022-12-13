package ProblemSet_14;

public class EvenOddNumber {
	public String isEvenorOdd(int n) {
		String evenorodd="";
		if(n%2==0) {
			evenorodd="Even";
		}else {
			evenorodd="Odd";
		}
		return evenorodd;
	}
	public static void main(String[]args) {
		int n=8;
		System.out.println("Even or Odd: "+new EvenOddNumber().isEvenorOdd(n));
	}

}
