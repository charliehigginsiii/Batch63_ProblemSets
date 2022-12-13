package ProblemSet_14;

public class Square {
	public int getSquare(int n1) {
		int power=1;
		for(int i=1;i<=2;i++) {
			power*=n1;
		}
		return power;
	}
	public static void main(String[]args) {
		int n1=7;
		System.out.println("Result: "+new Square().getSquare(n1));
	}
}
