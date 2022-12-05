package ProblemSet_8;

public class StringIterator {
	public void iterate(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[]args) {
		String s="Application";
		StringIterator iteration=new StringIterator();
		iteration.iterate(s);
	}

}
