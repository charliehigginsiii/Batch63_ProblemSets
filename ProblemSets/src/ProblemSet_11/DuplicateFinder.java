package ProblemSet_11;

public class DuplicateFinder {
	public String findDuplicates(String s) {
		String accumulator="";
		String duplicates="";
		for(int i=0;i<s.length();i++) {
			if(!accumulator.contains(s.charAt(i)+"")) {
				accumulator+=s.charAt(i)+"";
			}else {
				duplicates+=s.charAt(i)+" ";
			}
		}
		return duplicates;
	}
	public static void main(String[]args) {
		String s="bbhfesfdao";
		System.out.println("Duplicates: "+new DuplicateFinder().findDuplicates(s));
	}

}
