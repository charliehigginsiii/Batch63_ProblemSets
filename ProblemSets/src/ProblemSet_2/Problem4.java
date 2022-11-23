package ProblemSet_2;

import java.util.Collections;

public class Problem4 {
	public void bubblesort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1] ){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public boolean isEqual(int[]arr1,int[]arr2) {
		boolean isequal=false;
		if(arr1.length!=arr2.length) {
			return false;
		}else {
			bubblesort(arr1);
			bubblesort(arr2);
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
	public static void main(String []args) {
		int[]arr1= {1,4,7,2,7};
		int[]arr2= {1,4,7,2,7};
		System.out.println(new Problem4().isEqual(arr1, arr2));
	}

}
