package ProblemSet_11;

public class VowelRemover {
	public String removeVowerls(String s) {
		String newString="";
		for(int i=0;i<s.length();i++) {
			if(!String.valueOf(s.charAt(i)).toLowerCase().equals("a")&&!String.valueOf(s.charAt(i)).toLowerCase().equals("e")&&
					!String.valueOf(s.charAt(i)).toLowerCase().equals("i")&&!String.valueOf(s.charAt(i)).toLowerCase().equals("o")&&
					!String.valueOf(s.charAt(i)).toLowerCase().equals("u")) {
				newString+=s.charAt(i)+"";
			}
		}
		return newString;
	}
	public static void main(String[]args) {
		String s="Jupiter";
		s=new VowelRemover().removeVowerls(s);
		System.out.println(s);
	}

}
