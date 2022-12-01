package ProblemSet_6;

public class LetterToggle {
	public String toggleLetters(String s) {
		String toggledString="";
		for(int i=0;i<s.length();i++) {
			if(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i)).toUpperCase())) {
				toggledString+=String.valueOf(s.charAt(i)).toLowerCase();
			}else {
				toggledString+=String.valueOf(s.charAt(i)).toUpperCase();
			}
		}
		return toggledString;
	}
	public static void main(String[]args) {
		String s="Name";
		System.out.println(new LetterToggle().toggleLetters(s));
	}

}
