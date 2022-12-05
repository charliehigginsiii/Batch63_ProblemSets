package ProblemSet_8;

public interface Vertebrate {
	default void hasBackbone() {
		System.out.println("We have a backbone or spinal cord.");
	}
}
