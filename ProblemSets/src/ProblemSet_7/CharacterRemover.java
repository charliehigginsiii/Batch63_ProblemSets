package ProblemSet_7;

public class CharacterRemover {
	public String removeCharacter(String s,char c) {
		String newstring="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				String character2=c+"";
				newstring=s.replaceAll(character2,"");
			}
		}
		return newstring;
	}
	public static void main(String[]args) {
		String s="Elephant";
		s=new CharacterRemover().removeCharacter(s, 'e');
		System.out.println(s);
		
	}

}
