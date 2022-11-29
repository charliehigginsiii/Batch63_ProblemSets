package ProblemSet_5;

import java.util.Scanner;

public class NormalandTrace {
	public int findNormal(int[][]arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum+=arr[i][j]*arr[i][j];
			}
		}
		sum=(int)Math.sqrt(sum);
		return sum;
	}
	public int findTrace(int[][]arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][i];
		}
		return sum;
	}
	public static void main(String[]args) {
		int[][]arr= {{6,15,9},{12,2,8},{7,9,5}};
		System.out.println("Enter number: ");
		int n=new Scanner(System.in).nextInt();
		int normal=new NormalandTrace().findNormal(arr, n);
		int trace=new NormalandTrace().findTrace(arr, n);
		System.out.println("Normal: "+normal);
		System.out.println("Trace: "+trace);
	}
}
