package ProblemSet_6;

public class DigitCount {
	public int countDigits(int number) {
		String integerstring=Integer.toString(number);
		int count=0;
		for(int i=0;i<integerstring.length();i++) {
			if(String.valueOf(integerstring.charAt(i)).matches("[0-9]")){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args) {
		int number=9434390;
		int count=new DigitCount().countDigits(number);
		System.out.println(count);
	}

}
