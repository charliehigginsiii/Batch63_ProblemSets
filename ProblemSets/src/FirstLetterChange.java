
public class FirstLetterChange {
	public String capitalizeFirstLetter(String s) {
		String newstring="";
		newstring=String.valueOf(s.charAt(0)).toUpperCase();
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==' ') {
				newstring+=String.valueOf(s.charAt(i)).toUpperCase();
			}else {
				newstring+=s.charAt(i)+"";
			}
		}
		return newstring;
	}
	public static void main(String[]args) {
		String s="i am a smart person";
		s=new FirstLetterChange().capitalizeFirstLetter(s);
		System.out.println(s);
	}

}
