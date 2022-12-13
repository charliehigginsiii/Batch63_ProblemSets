package ProblemSet_13;

import java.util.ArrayList;

public class PrimeFactors {
	public ArrayList<Integer> findPrimeFactors(int n) {
		String factors="";
		ArrayList<Integer> primeFactors=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factors+=Integer.toString(i)+" ";
			}
		}
		System.out.println(factors);
		String [] factorsarray=factors.split(" ");
		String f="";
		for(int i=0;i<factorsarray.length;i++) {
			f="";
			for(int j=1;j<=Integer.parseInt(factorsarray[i]);j++) {
				double remainder=Integer.parseInt(factorsarray[i])%j;
				if(remainder==0.0&&j!=1&&j!=Integer.parseInt(factorsarray[i])) {
					f+=Integer.parseInt(factorsarray[i])+" ";
					break;
				}
			}
			if(f.equals("")) {
				primeFactors.add(Integer.parseInt(factorsarray[i]));
			}
		}
		return primeFactors;
		
	}
	public static void main(String[]args) {
		int n=63;
		System.out.println(new PrimeFactors().findPrimeFactors(n));
	}
}
