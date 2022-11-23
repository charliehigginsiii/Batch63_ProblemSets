package ProblemSet_3;

public class Problem6 {
public String replaceString(String originalString,String newString) {
	return originalString.replace(originalString, newString);
}
public static void main(String[]args) {
	String s="Chicken";
	System.out.println(s);
	s=new Problem6().replaceString(s, "Turkey");
	System.out.println(s);
}
}
