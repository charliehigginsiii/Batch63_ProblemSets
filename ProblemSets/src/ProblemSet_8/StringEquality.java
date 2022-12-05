package ProblemSet_8;

public class StringEquality {
	public void equalString(String s1,String s2) {
		if(s1.equals(s2)) {
			System.out.println("Properties:");
			System.out.println(true);
		}if(s1==s2) {
			System.out.println("Memory:");
			System.out.println(true);
		}else {
			System.out.println("Memory:");
			System.out.println(false);
		}
	}
	public static void main(String[]args) {
		StringEquality equalizer=new StringEquality();
		String s1="String";
		String s2="String";
		equalizer.equalString(s1,new String("String"));
	}

}
