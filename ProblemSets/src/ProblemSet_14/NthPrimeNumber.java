package ProblemSet_14;

import java.util.ArrayList;

public class NthPrimeNumber {
	public int getNthPrime(int[]arr, int n) {
		String factors="";
		ArrayList<Integer> primeNums=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			factors="";
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0&&j!=1&&j!=arr[i]) {
					factors+=String.valueOf(j)+" ";
				}
			}
			if(factors.equals("")) {
				primeNums.add(arr[i]);
			}
		}
		return primeNums.get(n-1);
	}
	public static void main(String[]args) {
		int n=2;
		int[]arr= {5,9,4,6,7,8,15,13,19};
		System.out.println(new NthPrimeNumber().getNthPrime(arr, n));
	}

}
