package ProblemSet_6;
class A{
	public void printA() {
	System.out.println("A");
	}
}
class B extends A{
	public void printB() {
	System.out.println("B");
	}
}
class C extends B{
	public void printC() {
	System.out.println("C");
	}
}
//Trying to use multiple inheritence is not allowed due to increase complexity result in compile time error 
public class DiamondProblem extends C/*,B*/  {
	public static void main(String[]args) {
		new DiamondProblem().printA();
	}
}
