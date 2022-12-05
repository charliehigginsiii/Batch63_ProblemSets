package ProblemSet_8;

public interface Mammal {
	default void hasHair() {
		System.out.println("We have hair.");
	}
	default void hasMilk() {
		System.out.println("We produce milk.");
	}

}
