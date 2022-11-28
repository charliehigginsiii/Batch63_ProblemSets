package ProblemSet_4;

import java.util.Arrays;

public class EqualArrays {
	public boolean checkIfEqual(int[] arr1,int[] arr2) {
		boolean isequal=false;
		if(arr1.length!=arr2.length) {
			isequal=false;
		}else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					isequal=true;
				}else {
					isequal=false;
					break;
				}
			}
		}
		return isequal;
	}
	public static void main(String[]args) {
		int[]arr1= {1,9,5,3,6};
		int[]arr2= {1,9,5,4,6};
		boolean arraysareequal=new EqualArrays().checkIfEqual(arr1, arr2);
		if(arraysareequal) {
			System.out.println("The arrays are equal.");
		}else {
			System.out.println("The arrays are not equal.");
		}
	}

}
