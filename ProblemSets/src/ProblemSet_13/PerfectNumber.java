package ProblemSet_13;

import java.util.ArrayList;

public class PerfectNumber {
	public boolean isPerfectNumber(int n) {
		boolean perfectNumber=false;
		ArrayList<Integer> factors=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n%i==0&&i!=n) {
				factors.add(i);
			}
		}
		int sum=0;
		for(int i=0;i<factors.size();i++) {
			sum+=factors.get(i);
		}
		if(sum==n) {
			perfectNumber=true;
		}
		return perfectNumber;
	}
	public static void main(String[]args) {
		int n=8128;
		System.out.println(new PerfectNumber().isPerfectNumber(n));
	}
}
