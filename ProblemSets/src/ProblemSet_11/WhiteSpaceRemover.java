package ProblemSet_11;

public class WhiteSpaceRemover {
	public String removeWhiteSpace(String s) {
		String newString="";
		char[] chararray=s.toCharArray();
		for(int i=0;i<chararray.length;i++) {
			if(chararray[i]!=' ') {
				newString+=chararray[i]+"";
			}
		}
		return newString;
	}
	public static void main(String[]args) {
		String s="The dog jumped over the fence.";
		s=new WhiteSpaceRemover().removeWhiteSpace(s);
		System.out.println(s);
	}

}
