package ProblemSet_4;

import java.util.Arrays;

public class ArrayMerger {
	public int[] mergeArrays(int[]arr1,int[]arr2) {
		int arr2index=0;
		int[] newarr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			newarr[i]=arr1[i];
		}
		for(int i=arr1.length;i<newarr.length;i++) {
			newarr[i]=arr2[arr2index];
			arr2index++;
		}
		return newarr;
	}
	public static void main(String[]args) {
		int[]arr1= {2,6,7,3,9,10,15};
		int[]arr2= {5,8,1,17,21};
		int[]mergedarray=new ArrayMerger().mergeArrays(arr1, arr2);
		for(int i=0;i<mergedarray.length;i++) {
			System.out.print(mergedarray[i]+" ");
		}
	}

}
