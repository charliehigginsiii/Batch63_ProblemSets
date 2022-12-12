package ProblemSet_12;

public class IntegerReversal {
	public int reverseInteger(int n) {
		String intString=n+"";
		int newint=0;
		String newIntString="";
		for(int i=intString.length()-1;i>=0;i--) {
			newIntString+=intString.charAt(i)+"";
		}
		newint=Integer.parseInt(newIntString);
		return newint;
	}
	public static void main(String[]args) {
		int number=19834;
		System.out.println("Reversed Number: "+new IntegerReversal().reverseInteger(number));
	}

}
