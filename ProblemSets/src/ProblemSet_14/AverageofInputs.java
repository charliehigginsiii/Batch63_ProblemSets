package ProblemSet_14;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageofInputs {
	public static void main(String[]args) {
		boolean keepgoing=true;
		ArrayList<Integer> numberslist=new ArrayList<>();
		while(keepgoing) {
			double sum=0;
			System.out.println("Enter Number: ");
			int input=new Scanner(System.in).nextInt();
			numberslist.add(input);
			for(int i=0;i<numberslist.size();i++) {
				sum+=(double)numberslist.get(i);
			}
			System.out.println("Average:"+sum/(double)numberslist.size());
			System.out.println("Do you want to enter another number?");
			keepgoing=new Scanner(System.in).nextBoolean();
		}
		
	}
}
