package ProblemSet_13;

public class NonOperatorAddition {
	public int addNums(int a, int b) {
		while(b!=0) {
			int c=a&b;
			a=a^b;
			b=c<<1;
			
		}
		return a;
	}
	public static void main(String[]args) {
		int a=6;
		int b=13;
		System.out.println("Sum: "+new NonOperatorAddition().addNums(a, b));
	}

}
