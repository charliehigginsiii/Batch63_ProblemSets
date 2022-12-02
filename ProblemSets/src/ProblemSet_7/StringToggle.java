package ProblemSet_7;

public class StringToggle {
	String newString="";
	public String toggleString(String s,char c) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				if(String.valueOf(s.charAt(i))==String.valueOf(s.charAt(i)).toLowerCase()) {
					newString+=String.valueOf(s.charAt(i)).toUpperCase();
				}else {
					newString+=String.valueOf(s.charAt(i)).toLowerCase();
				}
			}else {
				newString+=String.valueOf(s.charAt(i));
			}
		}
		return newString;
	}
	public static void main(String[]args) {
		String s="Apple";
		s=new CharacterRemover().removeCharacter(s, 'p');
		System.out.println(s);
		
	}

}
