package ProblemSet_3;

class Vehicle {
	public void moving() {
		System.out.println("Vehicle is moving");
	}
}

public class Problem10 extends Vehicle {
	@Override
	public void moving() {
		System.out.println("Vehicle is flying");
	}
	public static void main(String[]args) {
		new Problem10().moving();
	}
}
