package ProblemSet_13;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayInputAverage {
	public static void main(String[]args) {
		boolean keepgoing=true;
		ArrayList<Integer> numberlist=new ArrayList<>();
		while(keepgoing) {
			double sum=0;
			System.out.println("Enter Number: ");
			int input=new Scanner(System.in).nextInt();
			numberlist.add(input);
			for(int i=0;i<numberlist.size();i++) {
				sum+=(double)numberlist.get(i);
			}
			System.out.println("Average:"+sum/(double)numberlist.size());
			System.out.println("Do you want to enter another number?");
			keepgoing=new Scanner(System.in).nextBoolean();
		}
		
	}

}
