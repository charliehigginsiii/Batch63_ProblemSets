package ProblemSet_14;

import java.util.ArrayList;

public class PrimeinRange {
	public ArrayList<Integer> primesInRange(int min,int max) {
		int currentnum=min;
		String factors="";
		ArrayList<Integer> primeNums=new ArrayList<>();
		while(currentnum<=max) {
			factors="";
			for(int i=1;i<=currentnum;i++) {
				if(currentnum%i==0&&i!=1&&i!=currentnum) {
					factors+=String.valueOf(i)+" ";
				}
			}
			if(factors.equals("")) {
				primeNums.add(currentnum);
			}
			currentnum+=1;
		}
		return primeNums;
	}
	public static void main(String[]args) {
		int min=1;
		int max=100;
		System.out.println(new PrimeinRange().primesInRange(min, max));
	}

}
