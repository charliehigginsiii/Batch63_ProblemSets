package ProblemSet_4;

import java.util.Arrays;

public class ArrayCopy {
	public int[] copyArray(int[]arr1,int newlength) {
		return Arrays.copyOf(arr1, newlength);
	}
	public static void main(String[]args) {
		int[]arr1= {1,6,9,3,50,90,15,67,18};
		int[]arr2= new ArrayCopy().copyArray(arr1, 5);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
