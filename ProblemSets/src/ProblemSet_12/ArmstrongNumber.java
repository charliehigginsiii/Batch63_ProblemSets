package ProblemSet_12;

public class ArmstrongNumber {
	public boolean isArmstrong(int n) {
		boolean armstrongNumber=false;
		if(Integer.toString(n).toCharArray().length==3) {
			String intString=n+"";
			int sum=0;
			for(int i=0;i<intString.length();i++) {
				sum+=Math.pow(Integer.parseInt(String.valueOf(intString.charAt(i))),3);
			}
			if(sum==n) {
				armstrongNumber=true;
			}
		}
		return armstrongNumber;
	}
	public static void main(String[]args) {
		int n=371;
		System.out.println("Is this number an armstrong number? "+new ArmstrongNumber().isArmstrong(n));
		
	}

}
